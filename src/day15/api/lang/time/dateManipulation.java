package day15.api.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dateManipulation {
    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(3);

        System.out.println("orderDate = " + orderDate);
        System.out.println("takeDate = " + takeDate);

        // bulider 패턴
        LocalDateTime targerTime = LocalDateTime.now()
                .plusYears(1)
                .plusMonths(10)
                .plusHours(3)
                .minusMinutes(30);

        System.out.println("targerTime = " + targerTime);

        // 축제 시작일, 종료일
        LocalDateTime startDate = LocalDateTime.of(2021, 3, 1, 0, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2021, 3, 31, 23, 59, 0);
        LocalDateTime now = LocalDateTime.now();

        if (now.isBefore(endDate)) {
            System.out.println("진행 중인 행사");
        } else {
            System.out.println("종료된 행사");
        }

        // 날짜 연산
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("between = " + between);

    }
}
