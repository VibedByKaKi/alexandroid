package com.amazon.alexa.notification.actions.reminders.types;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class RecurrenceRules {
    private List<Integer> byMonthDays;
    private List<String> byMonths;
    private List<String> byWeekDays;
    private String flexibleRecurringPatternType;
    private String frequency;
    private List<Integer> intervals;
    private List<String> nextTriggerTimes;
    private List<String> notificationTimes;
    private List<Integer> offset;
    private String recurEndDate;
    private String recurEndTime;
    private String recurStartDate;
    private String recurStartTime;
    private List<String> recurrenceRules;

    public RecurrenceRules(RecurrenceRules recurrenceRules) {
        if (recurrenceRules != null) {
            this.byMonthDays = recurrenceRules.byMonthDays != null ? new ArrayList(recurrenceRules.byMonthDays) : null;
            this.byMonths = recurrenceRules.byMonths != null ? new ArrayList(recurrenceRules.byMonths) : null;
            this.byWeekDays = recurrenceRules.byWeekDays != null ? new ArrayList(recurrenceRules.byWeekDays) : null;
            this.flexibleRecurringPatternType = recurrenceRules.flexibleRecurringPatternType;
            this.frequency = recurrenceRules.frequency;
            this.intervals = recurrenceRules.intervals != null ? new ArrayList(recurrenceRules.intervals) : null;
            this.nextTriggerTimes = recurrenceRules.nextTriggerTimes != null ? new ArrayList(recurrenceRules.nextTriggerTimes) : null;
            this.notificationTimes = recurrenceRules.notificationTimes != null ? new ArrayList(recurrenceRules.notificationTimes) : null;
            this.offset = recurrenceRules.offset != null ? new ArrayList(recurrenceRules.offset) : null;
            this.recurEndDate = recurrenceRules.recurEndDate;
            this.recurEndTime = recurrenceRules.recurEndTime;
            this.recurStartDate = recurrenceRules.recurStartDate;
            this.recurStartTime = recurrenceRules.recurStartTime;
            this.recurrenceRules = recurrenceRules.recurrenceRules != null ? new ArrayList(recurrenceRules.recurrenceRules) : null;
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RecurrenceRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurrenceRules)) {
            return false;
        }
        RecurrenceRules recurrenceRules = (RecurrenceRules) obj;
        if (!recurrenceRules.canEqual(this)) {
            return false;
        }
        List<Integer> byMonthDays = getByMonthDays();
        List<Integer> byMonthDays2 = recurrenceRules.getByMonthDays();
        if (byMonthDays != null ? !byMonthDays.equals(byMonthDays2) : byMonthDays2 != null) {
            return false;
        }
        List<String> byMonths = getByMonths();
        List<String> byMonths2 = recurrenceRules.getByMonths();
        if (byMonths != null ? !byMonths.equals(byMonths2) : byMonths2 != null) {
            return false;
        }
        List<String> byWeekDays = getByWeekDays();
        List<String> byWeekDays2 = recurrenceRules.getByWeekDays();
        if (byWeekDays != null ? !byWeekDays.equals(byWeekDays2) : byWeekDays2 != null) {
            return false;
        }
        String flexibleRecurringPatternType = getFlexibleRecurringPatternType();
        String flexibleRecurringPatternType2 = recurrenceRules.getFlexibleRecurringPatternType();
        if (flexibleRecurringPatternType != null ? !flexibleRecurringPatternType.equals(flexibleRecurringPatternType2) : flexibleRecurringPatternType2 != null) {
            return false;
        }
        String frequency = getFrequency();
        String frequency2 = recurrenceRules.getFrequency();
        if (frequency != null ? !frequency.equals(frequency2) : frequency2 != null) {
            return false;
        }
        List<Integer> intervals = getIntervals();
        List<Integer> intervals2 = recurrenceRules.getIntervals();
        if (intervals != null ? !intervals.equals(intervals2) : intervals2 != null) {
            return false;
        }
        List<String> nextTriggerTimes = getNextTriggerTimes();
        List<String> nextTriggerTimes2 = recurrenceRules.getNextTriggerTimes();
        if (nextTriggerTimes != null ? !nextTriggerTimes.equals(nextTriggerTimes2) : nextTriggerTimes2 != null) {
            return false;
        }
        List<String> notificationTimes = getNotificationTimes();
        List<String> notificationTimes2 = recurrenceRules.getNotificationTimes();
        if (notificationTimes != null ? !notificationTimes.equals(notificationTimes2) : notificationTimes2 != null) {
            return false;
        }
        List<Integer> offset = getOffset();
        List<Integer> offset2 = recurrenceRules.getOffset();
        if (offset != null ? !offset.equals(offset2) : offset2 != null) {
            return false;
        }
        String recurEndDate = getRecurEndDate();
        String recurEndDate2 = recurrenceRules.getRecurEndDate();
        if (recurEndDate != null ? !recurEndDate.equals(recurEndDate2) : recurEndDate2 != null) {
            return false;
        }
        String recurEndTime = getRecurEndTime();
        String recurEndTime2 = recurrenceRules.getRecurEndTime();
        if (recurEndTime != null ? !recurEndTime.equals(recurEndTime2) : recurEndTime2 != null) {
            return false;
        }
        String recurStartDate = getRecurStartDate();
        String recurStartDate2 = recurrenceRules.getRecurStartDate();
        if (recurStartDate != null ? !recurStartDate.equals(recurStartDate2) : recurStartDate2 != null) {
            return false;
        }
        String recurStartTime = getRecurStartTime();
        String recurStartTime2 = recurrenceRules.getRecurStartTime();
        if (recurStartTime != null ? !recurStartTime.equals(recurStartTime2) : recurStartTime2 != null) {
            return false;
        }
        List<String> recurrenceRules2 = getRecurrenceRules();
        List<String> recurrenceRules3 = recurrenceRules.getRecurrenceRules();
        return recurrenceRules2 != null ? recurrenceRules2.equals(recurrenceRules3) : recurrenceRules3 == null;
    }

    public List<Integer> getByMonthDays() {
        if (this.byMonthDays != null) {
            return new ArrayList(this.byMonthDays);
        }
        return null;
    }

    public List<String> getByMonths() {
        if (this.byMonths != null) {
            return new ArrayList(this.byMonths);
        }
        return null;
    }

    public List<String> getByWeekDays() {
        if (this.byWeekDays != null) {
            return new ArrayList(this.byWeekDays);
        }
        return null;
    }

    public String getFlexibleRecurringPatternType() {
        return this.flexibleRecurringPatternType;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public List<Integer> getIntervals() {
        if (this.intervals != null) {
            return new ArrayList(this.intervals);
        }
        return null;
    }

    public List<String> getNextTriggerTimes() {
        if (this.nextTriggerTimes != null) {
            return new ArrayList(this.nextTriggerTimes);
        }
        return null;
    }

    public List<String> getNotificationTimes() {
        if (this.notificationTimes != null) {
            return new ArrayList(this.notificationTimes);
        }
        return null;
    }

    public List<Integer> getOffset() {
        if (this.offset != null) {
            return new ArrayList(this.offset);
        }
        return null;
    }

    public String getRecurEndDate() {
        return this.recurEndDate;
    }

    public String getRecurEndTime() {
        return this.recurEndTime;
    }

    public String getRecurStartDate() {
        return this.recurStartDate;
    }

    public String getRecurStartTime() {
        return this.recurStartTime;
    }

    public List<String> getRecurrenceRules() {
        if (this.recurrenceRules != null) {
            return new ArrayList(this.recurrenceRules);
        }
        return null;
    }

    public int hashCode() {
        List<Integer> byMonthDays = getByMonthDays();
        int hashCode = byMonthDays == null ? 43 : byMonthDays.hashCode();
        List<String> byMonths = getByMonths();
        int hashCode2 = ((hashCode + 59) * 59) + (byMonths == null ? 43 : byMonths.hashCode());
        List<String> byWeekDays = getByWeekDays();
        int hashCode3 = (hashCode2 * 59) + (byWeekDays == null ? 43 : byWeekDays.hashCode());
        String flexibleRecurringPatternType = getFlexibleRecurringPatternType();
        int hashCode4 = (hashCode3 * 59) + (flexibleRecurringPatternType == null ? 43 : flexibleRecurringPatternType.hashCode());
        String frequency = getFrequency();
        int hashCode5 = (hashCode4 * 59) + (frequency == null ? 43 : frequency.hashCode());
        List<Integer> intervals = getIntervals();
        int hashCode6 = (hashCode5 * 59) + (intervals == null ? 43 : intervals.hashCode());
        List<String> nextTriggerTimes = getNextTriggerTimes();
        int hashCode7 = (hashCode6 * 59) + (nextTriggerTimes == null ? 43 : nextTriggerTimes.hashCode());
        List<String> notificationTimes = getNotificationTimes();
        int hashCode8 = (hashCode7 * 59) + (notificationTimes == null ? 43 : notificationTimes.hashCode());
        List<Integer> offset = getOffset();
        int hashCode9 = (hashCode8 * 59) + (offset == null ? 43 : offset.hashCode());
        String recurEndDate = getRecurEndDate();
        int hashCode10 = (hashCode9 * 59) + (recurEndDate == null ? 43 : recurEndDate.hashCode());
        String recurEndTime = getRecurEndTime();
        int hashCode11 = (hashCode10 * 59) + (recurEndTime == null ? 43 : recurEndTime.hashCode());
        String recurStartDate = getRecurStartDate();
        int hashCode12 = (hashCode11 * 59) + (recurStartDate == null ? 43 : recurStartDate.hashCode());
        String recurStartTime = getRecurStartTime();
        int i = hashCode12 * 59;
        int hashCode13 = recurStartTime == null ? 43 : recurStartTime.hashCode();
        List<String> recurrenceRules = getRecurrenceRules();
        return ((i + hashCode13) * 59) + (recurrenceRules != null ? recurrenceRules.hashCode() : 43);
    }

    public void setByMonthDays(List<Integer> list) {
        this.byMonthDays = list != null ? new ArrayList(list) : null;
    }

    public void setByMonths(List<String> list) {
        this.byMonths = list != null ? new ArrayList(list) : null;
    }

    public void setByWeekDays(List<String> list) {
        this.byWeekDays = list != null ? new ArrayList(list) : null;
    }

    public void setFlexibleRecurringPatternType(String str) {
        this.flexibleRecurringPatternType = str;
    }

    public void setFrequency(String str) {
        this.frequency = str;
    }

    public void setIntervals(List<Integer> list) {
        this.intervals = list != null ? new ArrayList(list) : null;
    }

    public void setNextTriggerTimes(List<String> list) {
        this.nextTriggerTimes = list != null ? new ArrayList(list) : null;
    }

    public void setNotificationTimes(List<String> list) {
        this.notificationTimes = list != null ? new ArrayList(list) : null;
    }

    public void setOffset(List<Integer> list) {
        this.offset = list != null ? new ArrayList(list) : null;
    }

    public void setRecurEndDate(String str) {
        this.recurEndDate = str;
    }

    public void setRecurEndTime(String str) {
        this.recurEndTime = str;
    }

    public void setRecurStartDate(String str) {
        this.recurStartDate = str;
    }

    public void setRecurStartTime(String str) {
        this.recurStartTime = str;
    }

    public void setRecurrenceRules(List<String> list) {
        this.recurrenceRules = list != null ? new ArrayList(list) : null;
    }

    public String toString() {
        return "RecurrenceRules(byMonthDays=" + getByMonthDays() + ", byMonths=" + getByMonths() + ", byWeekDays=" + getByWeekDays() + ", flexibleRecurringPatternType=" + getFlexibleRecurringPatternType() + ", frequency=" + getFrequency() + ", intervals=" + getIntervals() + ", nextTriggerTimes=" + getNextTriggerTimes() + ", notificationTimes=" + getNotificationTimes() + ", offset=" + getOffset() + ", recurEndDate=" + getRecurEndDate() + ", recurEndTime=" + getRecurEndTime() + ", recurStartDate=" + getRecurStartDate() + ", recurStartTime=" + getRecurStartTime() + ", recurrenceRules=" + getRecurrenceRules() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public RecurrenceRules() {
    }
}
