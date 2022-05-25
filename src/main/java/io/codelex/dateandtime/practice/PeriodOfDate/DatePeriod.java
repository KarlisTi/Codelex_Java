package io.codelex.dateandtime.practice.PeriodOfDate;

import java.time.LocalDate;


public class DatePeriod {

    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public boolean overlapPeriods(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isBefore(secondPeriod.start)
                || secondPeriod.start.isBefore(this.start) && secondPeriod.end.isBefore(this.start);
    }

    public boolean firstIncludesSecond(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.start) ||
                this.start.equals(secondPeriod.start) && this.end.isAfter(secondPeriod.start);
    }

    public boolean secondIncludesFirst(DatePeriod secondPeriod) {
        return secondPeriod.start.isBefore(this.start) && secondPeriod.end.isAfter(this.start) ||
                secondPeriod.start.equals(this.start) && secondPeriod.end.isAfter(this.start);
    }

    public boolean secondOverlapsFirst(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.start);
    }

    public boolean firstOverLapsSecond(DatePeriod secondPeriod) {
        return secondPeriod.start.isBefore(this.start) && secondPeriod.end.isBefore(this.end);
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (overlapPeriods(secondPeriod)) {
            return null;
        }
        if (secondOverlapsFirst(secondPeriod)) {
            return new DatePeriod(secondPeriod.start, this.end);
        } else if (firstOverLapsSecond(secondPeriod)) {
            return new DatePeriod(this.start, secondPeriod.end);
        }
        if (firstIncludesSecond(secondPeriod)) {
            return new DatePeriod(this.start, this.end);
        } else if (secondIncludesFirst(secondPeriod)) {
            return secondPeriod;
        }
        return null;
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
