package com.amazon.alexa.app.notification.actions.handlers.reminders.types;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
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

    public RecurrenceRules() {
    }
}
