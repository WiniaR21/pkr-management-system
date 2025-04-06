package pkr_management_system.report.embedable;

import java.time.LocalDate;

public record ReportDate(LocalDate date, Shift shift) {

    public ReportDate(LocalDate date, Shift shift) {
        this.date = date;
        this.shift = shift;
    }
}
