package com.amazon.alexa.notification.actions.reminders.types;

import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class RemindersNotification {
    private static final String TAG = "RemindersNotification";
    private String alarmLabel;
    private long alarmTime;
    private String automationId;
    private long createdDate;
    private String deferredAtTime;
    private String deliveryType;
    private String deviceName;
    private String deviceSerialNumber;
    private String deviceType;
    private FollowUpMetadata followUpMetadata;
    private String id;
    private long lastOccurrenceTimeInMilli;
    private String lastTriggerTimeInUtc;
    private long lastUpdatedDate;
    private Integer loopCount;
    private String musicAlarmId;
    private String musicEntity;
    private String notificationIndex;
    private String originalDate;
    private long originalDurationInMillis;
    private String originalTime;
    private PersonProfile personProfile;
    private String primaryDeviceState;
    private String provider;
    private RecurrenceRules rRuleData;
    private boolean recurrenceEligibility;
    private String recurringPattern;
    private long remainingTime;
    private String reminderAppLabel;
    private String reminderLabel;
    private String reminderSubLabel;
    private Boolean showDeregisteredWarning;
    private String snoozedToTime;
    private NotificationSound sound;
    private String status;
    private PersonProfile targetPersonProfiles;
    private String timeZoneId;
    private String timerLabel;
    private long triggerTime;
    private String type;
    private String version;

    public boolean canEqual(Object obj) {
        return obj instanceof RemindersNotification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemindersNotification)) {
            return false;
        }
        RemindersNotification remindersNotification = (RemindersNotification) obj;
        if (!remindersNotification.canEqual(this) || getRemainingTime() != remindersNotification.getRemainingTime() || getAlarmTime() != remindersNotification.getAlarmTime() || getTriggerTime() != remindersNotification.getTriggerTime() || getCreatedDate() != remindersNotification.getCreatedDate() || getLastUpdatedDate() != remindersNotification.getLastUpdatedDate() || getOriginalDurationInMillis() != remindersNotification.getOriginalDurationInMillis() || getLastOccurrenceTimeInMilli() != remindersNotification.getLastOccurrenceTimeInMilli() || isRecurrenceEligibility() != remindersNotification.isRecurrenceEligibility()) {
            return false;
        }
        Integer loopCount = getLoopCount();
        Integer loopCount2 = remindersNotification.getLoopCount();
        if (loopCount != null ? !loopCount.equals(loopCount2) : loopCount2 != null) {
            return false;
        }
        Boolean showDeregisteredWarning = getShowDeregisteredWarning();
        Boolean showDeregisteredWarning2 = remindersNotification.getShowDeregisteredWarning();
        if (showDeregisteredWarning != null ? !showDeregisteredWarning.equals(showDeregisteredWarning2) : showDeregisteredWarning2 != null) {
            return false;
        }
        String id = getId();
        String id2 = remindersNotification.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String notificationIndex = getNotificationIndex();
        String notificationIndex2 = remindersNotification.getNotificationIndex();
        if (notificationIndex != null ? !notificationIndex.equals(notificationIndex2) : notificationIndex2 != null) {
            return false;
        }
        String version = getVersion();
        String version2 = remindersNotification.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = remindersNotification.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        String deviceSerialNumber2 = remindersNotification.getDeviceSerialNumber();
        if (deviceSerialNumber != null ? !deviceSerialNumber.equals(deviceSerialNumber2) : deviceSerialNumber2 != null) {
            return false;
        }
        String deviceType = getDeviceType();
        String deviceType2 = remindersNotification.getDeviceType();
        if (deviceType != null ? !deviceType.equals(deviceType2) : deviceType2 != null) {
            return false;
        }
        String recurringPattern = getRecurringPattern();
        String recurringPattern2 = remindersNotification.getRecurringPattern();
        if (recurringPattern != null ? !recurringPattern.equals(recurringPattern2) : recurringPattern2 != null) {
            return false;
        }
        String type = getType();
        String type2 = remindersNotification.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        NotificationSound sound = getSound();
        NotificationSound sound2 = remindersNotification.getSound();
        if (sound != null ? !sound.equals(sound2) : sound2 != null) {
            return false;
        }
        String reminderLabel = getReminderLabel();
        String reminderLabel2 = remindersNotification.getReminderLabel();
        if (reminderLabel != null ? !reminderLabel.equals(reminderLabel2) : reminderLabel2 != null) {
            return false;
        }
        String reminderSubLabel = getReminderSubLabel();
        String reminderSubLabel2 = remindersNotification.getReminderSubLabel();
        if (reminderSubLabel != null ? !reminderSubLabel.equals(reminderSubLabel2) : reminderSubLabel2 != null) {
            return false;
        }
        String reminderAppLabel = getReminderAppLabel();
        String reminderAppLabel2 = remindersNotification.getReminderAppLabel();
        if (reminderAppLabel != null ? !reminderAppLabel.equals(reminderAppLabel2) : reminderAppLabel2 != null) {
            return false;
        }
        String timerLabel = getTimerLabel();
        String timerLabel2 = remindersNotification.getTimerLabel();
        if (timerLabel != null ? !timerLabel.equals(timerLabel2) : timerLabel2 != null) {
            return false;
        }
        String alarmLabel = getAlarmLabel();
        String alarmLabel2 = remindersNotification.getAlarmLabel();
        if (alarmLabel != null ? !alarmLabel.equals(alarmLabel2) : alarmLabel2 != null) {
            return false;
        }
        String originalTime = getOriginalTime();
        String originalTime2 = remindersNotification.getOriginalTime();
        if (originalTime != null ? !originalTime.equals(originalTime2) : originalTime2 != null) {
            return false;
        }
        String originalDate = getOriginalDate();
        String originalDate2 = remindersNotification.getOriginalDate();
        if (originalDate != null ? !originalDate.equals(originalDate2) : originalDate2 != null) {
            return false;
        }
        String timeZoneId = getTimeZoneId();
        String timeZoneId2 = remindersNotification.getTimeZoneId();
        if (timeZoneId != null ? !timeZoneId.equals(timeZoneId2) : timeZoneId2 != null) {
            return false;
        }
        String musicAlarmId = getMusicAlarmId();
        String musicAlarmId2 = remindersNotification.getMusicAlarmId();
        if (musicAlarmId != null ? !musicAlarmId.equals(musicAlarmId2) : musicAlarmId2 != null) {
            return false;
        }
        String provider = getProvider();
        String provider2 = remindersNotification.getProvider();
        if (provider != null ? !provider.equals(provider2) : provider2 != null) {
            return false;
        }
        String musicEntity = getMusicEntity();
        String musicEntity2 = remindersNotification.getMusicEntity();
        if (musicEntity != null ? !musicEntity.equals(musicEntity2) : musicEntity2 != null) {
            return false;
        }
        String snoozedToTime = getSnoozedToTime();
        String snoozedToTime2 = remindersNotification.getSnoozedToTime();
        if (snoozedToTime != null ? !snoozedToTime.equals(snoozedToTime2) : snoozedToTime2 != null) {
            return false;
        }
        String deferredAtTime = getDeferredAtTime();
        String deferredAtTime2 = remindersNotification.getDeferredAtTime();
        if (deferredAtTime != null ? !deferredAtTime.equals(deferredAtTime2) : deferredAtTime2 != null) {
            return false;
        }
        PersonProfile personProfile = getPersonProfile();
        PersonProfile personProfile2 = remindersNotification.getPersonProfile();
        if (personProfile != null ? !personProfile.equals(personProfile2) : personProfile2 != null) {
            return false;
        }
        PersonProfile targetPersonProfiles = getTargetPersonProfiles();
        PersonProfile targetPersonProfiles2 = remindersNotification.getTargetPersonProfiles();
        if (targetPersonProfiles != null ? !targetPersonProfiles.equals(targetPersonProfiles2) : targetPersonProfiles2 != null) {
            return false;
        }
        String automationId = getAutomationId();
        String automationId2 = remindersNotification.getAutomationId();
        if (automationId != null ? !automationId.equals(automationId2) : automationId2 != null) {
            return false;
        }
        String deliveryType = getDeliveryType();
        String deliveryType2 = remindersNotification.getDeliveryType();
        if (deliveryType != null ? !deliveryType.equals(deliveryType2) : deliveryType2 != null) {
            return false;
        }
        String deviceName = getDeviceName();
        String deviceName2 = remindersNotification.getDeviceName();
        if (deviceName != null ? !deviceName.equals(deviceName2) : deviceName2 != null) {
            return false;
        }
        String primaryDeviceState = getPrimaryDeviceState();
        String primaryDeviceState2 = remindersNotification.getPrimaryDeviceState();
        if (primaryDeviceState != null ? !primaryDeviceState.equals(primaryDeviceState2) : primaryDeviceState2 != null) {
            return false;
        }
        FollowUpMetadata followUpMetadata = getFollowUpMetadata();
        FollowUpMetadata followUpMetadata2 = remindersNotification.getFollowUpMetadata();
        if (followUpMetadata != null ? !followUpMetadata.equals(followUpMetadata2) : followUpMetadata2 != null) {
            return false;
        }
        String lastTriggerTimeInUtc = getLastTriggerTimeInUtc();
        String lastTriggerTimeInUtc2 = remindersNotification.getLastTriggerTimeInUtc();
        if (lastTriggerTimeInUtc != null ? !lastTriggerTimeInUtc.equals(lastTriggerTimeInUtc2) : lastTriggerTimeInUtc2 != null) {
            return false;
        }
        RecurrenceRules rRuleData = getRRuleData();
        RecurrenceRules rRuleData2 = remindersNotification.getRRuleData();
        return rRuleData != null ? rRuleData.equals(rRuleData2) : rRuleData2 == null;
    }

    public String getAlarmLabel() {
        return this.alarmLabel;
    }

    public long getAlarmTime() {
        return this.alarmTime;
    }

    public String getAutomationId() {
        return this.automationId;
    }

    public long getCreatedDate() {
        return this.createdDate;
    }

    public String getDeferredAtTime() {
        return this.deferredAtTime;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public FollowUpMetadata getFollowUpMetadata() {
        FollowUpMetadata followUpMetadata = this.followUpMetadata;
        if (followUpMetadata != null) {
            return new FollowUpMetadata(followUpMetadata);
        }
        return null;
    }

    public String getId() {
        return this.id;
    }

    public long getLastOccurrenceTimeInMilli() {
        return this.lastOccurrenceTimeInMilli;
    }

    public String getLastTriggerTimeInUtc() {
        return this.lastTriggerTimeInUtc;
    }

    public long getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public Integer getLoopCount() {
        return this.loopCount;
    }

    public String getMusicAlarmId() {
        return this.musicAlarmId;
    }

    public String getMusicEntity() {
        return this.musicEntity;
    }

    public LocalDateTime getNextRecurrence() {
        List<String> nextTriggerTimes;
        RecurrenceRules recurrenceRules = this.rRuleData;
        if (recurrenceRules != null && (nextTriggerTimes = recurrenceRules.getNextTriggerTimes()) != null && nextTriggerTimes.size() > 0) {
            try {
                return LocalDateTime.parse(nextTriggerTimes.get(0), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            } catch (DateTimeParseException unused) {
                Log.e(TAG, "Recurring Reminder doesn't have next trigger time");
            }
        }
        return null;
    }

    public String getNotificationIndex() {
        return this.notificationIndex;
    }

    public String getOriginalDate() {
        return this.originalDate;
    }

    public long getOriginalDurationInMillis() {
        return this.originalDurationInMillis;
    }

    public String getOriginalTime() {
        return this.originalTime;
    }

    public PersonProfile getPersonProfile() {
        PersonProfile personProfile = this.personProfile;
        if (personProfile != null) {
            return new PersonProfile(personProfile);
        }
        return null;
    }

    public String getPrimaryDeviceState() {
        return this.primaryDeviceState;
    }

    public String getProvider() {
        return this.provider;
    }

    public RecurrenceRules getRRuleData() {
        RecurrenceRules recurrenceRules = this.rRuleData;
        if (recurrenceRules != null) {
            return new RecurrenceRules(recurrenceRules);
        }
        return null;
    }

    public String getRecurringPattern() {
        return this.recurringPattern;
    }

    public long getRemainingTime() {
        return this.remainingTime;
    }

    public String getReminderAppLabel() {
        return this.reminderAppLabel;
    }

    public String getReminderLabel() {
        return this.reminderLabel;
    }

    public String getReminderSubLabel() {
        return this.reminderSubLabel;
    }

    public Boolean getShowDeregisteredWarning() {
        return this.showDeregisteredWarning;
    }

    public String getSnoozedToTime() {
        return this.snoozedToTime;
    }

    public NotificationSound getSound() {
        NotificationSound notificationSound = this.sound;
        if (notificationSound != null) {
            return new NotificationSound(notificationSound);
        }
        return null;
    }

    public String getStatus() {
        return this.status;
    }

    public PersonProfile getTargetPersonProfiles() {
        PersonProfile personProfile = this.targetPersonProfiles;
        if (personProfile != null) {
            return new PersonProfile(personProfile);
        }
        return null;
    }

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public String getTimerLabel() {
        return this.timerLabel;
    }

    public long getTriggerTime() {
        return this.triggerTime;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        long remainingTime = getRemainingTime();
        long alarmTime = getAlarmTime();
        int i = ((((int) (remainingTime ^ (remainingTime >>> 32))) + 59) * 59) + ((int) (alarmTime ^ (alarmTime >>> 32)));
        long triggerTime = getTriggerTime();
        int i2 = (i * 59) + ((int) (triggerTime ^ (triggerTime >>> 32)));
        long createdDate = getCreatedDate();
        int i3 = (i2 * 59) + ((int) (createdDate ^ (createdDate >>> 32)));
        long lastUpdatedDate = getLastUpdatedDate();
        int i4 = (i3 * 59) + ((int) (lastUpdatedDate ^ (lastUpdatedDate >>> 32)));
        long originalDurationInMillis = getOriginalDurationInMillis();
        int i5 = (i4 * 59) + ((int) (originalDurationInMillis ^ (originalDurationInMillis >>> 32)));
        long lastOccurrenceTimeInMilli = getLastOccurrenceTimeInMilli();
        int i6 = (((i5 * 59) + ((int) ((lastOccurrenceTimeInMilli >>> 32) ^ lastOccurrenceTimeInMilli))) * 59) + (isRecurrenceEligibility() ? 79 : 97);
        Integer loopCount = getLoopCount();
        int hashCode = (i6 * 59) + (loopCount == null ? 43 : loopCount.hashCode());
        Boolean showDeregisteredWarning = getShowDeregisteredWarning();
        int hashCode2 = (hashCode * 59) + (showDeregisteredWarning == null ? 43 : showDeregisteredWarning.hashCode());
        String id = getId();
        int hashCode3 = (hashCode2 * 59) + (id == null ? 43 : id.hashCode());
        String notificationIndex = getNotificationIndex();
        int hashCode4 = (hashCode3 * 59) + (notificationIndex == null ? 43 : notificationIndex.hashCode());
        String version = getVersion();
        int hashCode5 = (hashCode4 * 59) + (version == null ? 43 : version.hashCode());
        String status = getStatus();
        int hashCode6 = (hashCode5 * 59) + (status == null ? 43 : status.hashCode());
        String deviceSerialNumber = getDeviceSerialNumber();
        int hashCode7 = (hashCode6 * 59) + (deviceSerialNumber == null ? 43 : deviceSerialNumber.hashCode());
        String deviceType = getDeviceType();
        int hashCode8 = (hashCode7 * 59) + (deviceType == null ? 43 : deviceType.hashCode());
        String recurringPattern = getRecurringPattern();
        int hashCode9 = (hashCode8 * 59) + (recurringPattern == null ? 43 : recurringPattern.hashCode());
        String type = getType();
        int hashCode10 = (hashCode9 * 59) + (type == null ? 43 : type.hashCode());
        NotificationSound sound = getSound();
        int hashCode11 = (hashCode10 * 59) + (sound == null ? 43 : sound.hashCode());
        String reminderLabel = getReminderLabel();
        int hashCode12 = (hashCode11 * 59) + (reminderLabel == null ? 43 : reminderLabel.hashCode());
        String reminderSubLabel = getReminderSubLabel();
        int hashCode13 = (hashCode12 * 59) + (reminderSubLabel == null ? 43 : reminderSubLabel.hashCode());
        String reminderAppLabel = getReminderAppLabel();
        int hashCode14 = (hashCode13 * 59) + (reminderAppLabel == null ? 43 : reminderAppLabel.hashCode());
        String timerLabel = getTimerLabel();
        int hashCode15 = (hashCode14 * 59) + (timerLabel == null ? 43 : timerLabel.hashCode());
        String alarmLabel = getAlarmLabel();
        int hashCode16 = (hashCode15 * 59) + (alarmLabel == null ? 43 : alarmLabel.hashCode());
        String originalTime = getOriginalTime();
        int hashCode17 = (hashCode16 * 59) + (originalTime == null ? 43 : originalTime.hashCode());
        String originalDate = getOriginalDate();
        int hashCode18 = (hashCode17 * 59) + (originalDate == null ? 43 : originalDate.hashCode());
        String timeZoneId = getTimeZoneId();
        int hashCode19 = (hashCode18 * 59) + (timeZoneId == null ? 43 : timeZoneId.hashCode());
        String musicAlarmId = getMusicAlarmId();
        int hashCode20 = (hashCode19 * 59) + (musicAlarmId == null ? 43 : musicAlarmId.hashCode());
        String provider = getProvider();
        int hashCode21 = (hashCode20 * 59) + (provider == null ? 43 : provider.hashCode());
        String musicEntity = getMusicEntity();
        int hashCode22 = (hashCode21 * 59) + (musicEntity == null ? 43 : musicEntity.hashCode());
        String snoozedToTime = getSnoozedToTime();
        int hashCode23 = (hashCode22 * 59) + (snoozedToTime == null ? 43 : snoozedToTime.hashCode());
        String deferredAtTime = getDeferredAtTime();
        int hashCode24 = (hashCode23 * 59) + (deferredAtTime == null ? 43 : deferredAtTime.hashCode());
        PersonProfile personProfile = getPersonProfile();
        int hashCode25 = (hashCode24 * 59) + (personProfile == null ? 43 : personProfile.hashCode());
        PersonProfile targetPersonProfiles = getTargetPersonProfiles();
        int hashCode26 = (hashCode25 * 59) + (targetPersonProfiles == null ? 43 : targetPersonProfiles.hashCode());
        String automationId = getAutomationId();
        int hashCode27 = (hashCode26 * 59) + (automationId == null ? 43 : automationId.hashCode());
        String deliveryType = getDeliveryType();
        int hashCode28 = (hashCode27 * 59) + (deliveryType == null ? 43 : deliveryType.hashCode());
        String deviceName = getDeviceName();
        int hashCode29 = (hashCode28 * 59) + (deviceName == null ? 43 : deviceName.hashCode());
        String primaryDeviceState = getPrimaryDeviceState();
        int hashCode30 = (hashCode29 * 59) + (primaryDeviceState == null ? 43 : primaryDeviceState.hashCode());
        FollowUpMetadata followUpMetadata = getFollowUpMetadata();
        int hashCode31 = (hashCode30 * 59) + (followUpMetadata == null ? 43 : followUpMetadata.hashCode());
        String lastTriggerTimeInUtc = getLastTriggerTimeInUtc();
        int i7 = hashCode31 * 59;
        int hashCode32 = lastTriggerTimeInUtc == null ? 43 : lastTriggerTimeInUtc.hashCode();
        RecurrenceRules rRuleData = getRRuleData();
        return ((i7 + hashCode32) * 59) + (rRuleData != null ? rRuleData.hashCode() : 43);
    }

    public boolean isRecurrenceEligibility() {
        return this.recurrenceEligibility;
    }

    public void setAlarmLabel(String str) {
        this.alarmLabel = str;
    }

    public void setAlarmTime(long j) {
        this.alarmTime = j;
    }

    public void setAutomationId(String str) {
        this.automationId = str;
    }

    public void setCreatedDate(long j) {
        this.createdDate = j;
    }

    public void setDeferredAtTime(String str) {
        this.deferredAtTime = str;
    }

    public void setDeliveryType(String str) {
        this.deliveryType = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setFollowUpMetadata(FollowUpMetadata followUpMetadata) {
        this.followUpMetadata = followUpMetadata != null ? new FollowUpMetadata(followUpMetadata) : null;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastOccurrenceTimeInMilli(long j) {
        this.lastOccurrenceTimeInMilli = j;
    }

    public void setLastTriggerTimeInUtc(String str) {
        this.lastTriggerTimeInUtc = str;
    }

    public void setLastUpdatedDate(long j) {
        this.lastUpdatedDate = j;
    }

    public void setLoopCount(Integer num) {
        this.loopCount = num;
    }

    public void setMusicAlarmId(String str) {
        this.musicAlarmId = str;
    }

    public void setMusicEntity(String str) {
        this.musicEntity = str;
    }

    public void setNotificationIndex(String str) {
        this.notificationIndex = str;
    }

    public void setOriginalDate(String str) {
        this.originalDate = str;
    }

    public void setOriginalDurationInMillis(long j) {
        this.originalDurationInMillis = j;
    }

    public void setOriginalTime(String str) {
        this.originalTime = str;
    }

    public void setPersonProfile(PersonProfile personProfile) {
        this.personProfile = personProfile != null ? new PersonProfile(personProfile) : null;
    }

    public void setPrimaryDeviceState(String str) {
        this.primaryDeviceState = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setRRuleData(RecurrenceRules recurrenceRules) {
        this.rRuleData = recurrenceRules != null ? new RecurrenceRules(recurrenceRules) : null;
    }

    public void setRecurrenceEligibility(boolean z) {
        this.recurrenceEligibility = z;
    }

    public void setRecurringPattern(String str) {
        this.recurringPattern = str;
    }

    public void setRemainingTime(long j) {
        this.remainingTime = j;
    }

    public void setReminderAppLabel(String str) {
        this.reminderAppLabel = str;
    }

    public void setReminderLabel(String str) {
        this.reminderLabel = str;
    }

    public void setReminderSubLabel(String str) {
        this.reminderSubLabel = str;
    }

    public void setShowDeregisteredWarning(Boolean bool) {
        this.showDeregisteredWarning = bool;
    }

    public void setSnoozedToTime(String str) {
        this.snoozedToTime = str;
    }

    public void setSound(NotificationSound notificationSound) {
        this.sound = notificationSound != null ? new NotificationSound(notificationSound) : null;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTargetPersonProfiles(PersonProfile personProfile) {
        this.targetPersonProfiles = personProfile != null ? new PersonProfile(personProfile) : null;
    }

    public void setTimeZoneId(String str) {
        this.timeZoneId = str;
    }

    public void setTimerLabel(String str) {
        this.timerLabel = str;
    }

    public void setTriggerTime(long j) {
        this.triggerTime = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "RemindersNotification(id=" + getId() + ", notificationIndex=" + getNotificationIndex() + ", version=" + getVersion() + ", status=" + getStatus() + ", deviceSerialNumber=" + getDeviceSerialNumber() + ", deviceType=" + getDeviceType() + ", recurringPattern=" + getRecurringPattern() + ", type=" + getType() + ", remainingTime=" + getRemainingTime() + ", alarmTime=" + getAlarmTime() + ", triggerTime=" + getTriggerTime() + ", createdDate=" + getCreatedDate() + ", lastUpdatedDate=" + getLastUpdatedDate() + ", sound=" + getSound() + ", reminderLabel=" + getReminderLabel() + ", reminderSubLabel=" + getReminderSubLabel() + ", reminderAppLabel=" + getReminderAppLabel() + ", timerLabel=" + getTimerLabel() + ", alarmLabel=" + getAlarmLabel() + ", originalDurationInMillis=" + getOriginalDurationInMillis() + ", originalTime=" + getOriginalTime() + ", originalDate=" + getOriginalDate() + ", timeZoneId=" + getTimeZoneId() + ", musicAlarmId=" + getMusicAlarmId() + ", provider=" + getProvider() + ", musicEntity=" + getMusicEntity() + ", snoozedToTime=" + getSnoozedToTime() + ", deferredAtTime=" + getDeferredAtTime() + ", personProfile=" + getPersonProfile() + ", targetPersonProfiles=" + getTargetPersonProfiles() + ", automationId=" + getAutomationId() + ", lastOccurrenceTimeInMilli=" + getLastOccurrenceTimeInMilli() + ", recurrenceEligibility=" + isRecurrenceEligibility() + ", deliveryType=" + getDeliveryType() + ", deviceName=" + getDeviceName() + ", loopCount=" + getLoopCount() + ", primaryDeviceState=" + getPrimaryDeviceState() + ", followUpMetadata=" + getFollowUpMetadata() + ", lastTriggerTimeInUtc=" + getLastTriggerTimeInUtc() + ", showDeregisteredWarning=" + getShowDeregisteredWarning() + ", rRuleData=" + getRRuleData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PersonProfile {
        private String firstName;
        private String lastName;
        private String personId;
        private String speakerId;

        public PersonProfile(PersonProfile personProfile) {
            if (personProfile != null) {
                this.speakerId = personProfile.speakerId;
                this.personId = personProfile.personId;
                this.lastName = personProfile.lastName;
                this.firstName = personProfile.firstName;
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof PersonProfile;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PersonProfile)) {
                return false;
            }
            PersonProfile personProfile = (PersonProfile) obj;
            if (!personProfile.canEqual(this)) {
                return false;
            }
            String speakerId = getSpeakerId();
            String speakerId2 = personProfile.getSpeakerId();
            if (speakerId != null ? !speakerId.equals(speakerId2) : speakerId2 != null) {
                return false;
            }
            String personId = getPersonId();
            String personId2 = personProfile.getPersonId();
            if (personId != null ? !personId.equals(personId2) : personId2 != null) {
                return false;
            }
            String lastName = getLastName();
            String lastName2 = personProfile.getLastName();
            if (lastName != null ? !lastName.equals(lastName2) : lastName2 != null) {
                return false;
            }
            String firstName = getFirstName();
            String firstName2 = personProfile.getFirstName();
            return firstName != null ? firstName.equals(firstName2) : firstName2 == null;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getPersonId() {
            return this.personId;
        }

        public String getSpeakerId() {
            return this.speakerId;
        }

        public int hashCode() {
            String speakerId = getSpeakerId();
            int hashCode = speakerId == null ? 43 : speakerId.hashCode();
            String personId = getPersonId();
            int hashCode2 = ((hashCode + 59) * 59) + (personId == null ? 43 : personId.hashCode());
            String lastName = getLastName();
            int i = hashCode2 * 59;
            int hashCode3 = lastName == null ? 43 : lastName.hashCode();
            String firstName = getFirstName();
            return ((i + hashCode3) * 59) + (firstName != null ? firstName.hashCode() : 43);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setPersonId(String str) {
            this.personId = str;
        }

        public void setSpeakerId(String str) {
            this.speakerId = str;
        }

        public String toString() {
            return "RemindersNotification.PersonProfile(speakerId=" + getSpeakerId() + ", personId=" + getPersonId() + ", lastName=" + getLastName() + ", firstName=" + getFirstName() + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public PersonProfile() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotificationSound {
        private String displayName;
        private String folder;
        private String id;
        private boolean isChildDirected;
        private int numAssets;
        private String providerId;
        private String sampleUrl;
        private String sampleVideoUrl;
        private String skillUrl;

        public NotificationSound(NotificationSound notificationSound) {
            if (notificationSound != null) {
                this.id = notificationSound.id;
                this.providerId = notificationSound.providerId;
                this.displayName = notificationSound.displayName;
                this.sampleUrl = notificationSound.sampleUrl;
                this.sampleVideoUrl = notificationSound.sampleVideoUrl;
                this.folder = notificationSound.folder;
                this.isChildDirected = notificationSound.isChildDirected;
                this.numAssets = notificationSound.numAssets;
                this.skillUrl = notificationSound.skillUrl;
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof NotificationSound;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationSound)) {
                return false;
            }
            NotificationSound notificationSound = (NotificationSound) obj;
            if (!notificationSound.canEqual(this) || isChildDirected() != notificationSound.isChildDirected() || getNumAssets() != notificationSound.getNumAssets()) {
                return false;
            }
            String id = getId();
            String id2 = notificationSound.getId();
            if (id != null ? !id.equals(id2) : id2 != null) {
                return false;
            }
            String providerId = getProviderId();
            String providerId2 = notificationSound.getProviderId();
            if (providerId != null ? !providerId.equals(providerId2) : providerId2 != null) {
                return false;
            }
            String displayName = getDisplayName();
            String displayName2 = notificationSound.getDisplayName();
            if (displayName != null ? !displayName.equals(displayName2) : displayName2 != null) {
                return false;
            }
            String sampleUrl = getSampleUrl();
            String sampleUrl2 = notificationSound.getSampleUrl();
            if (sampleUrl != null ? !sampleUrl.equals(sampleUrl2) : sampleUrl2 != null) {
                return false;
            }
            String sampleVideoUrl = getSampleVideoUrl();
            String sampleVideoUrl2 = notificationSound.getSampleVideoUrl();
            if (sampleVideoUrl != null ? !sampleVideoUrl.equals(sampleVideoUrl2) : sampleVideoUrl2 != null) {
                return false;
            }
            String folder = getFolder();
            String folder2 = notificationSound.getFolder();
            if (folder != null ? !folder.equals(folder2) : folder2 != null) {
                return false;
            }
            String skillUrl = getSkillUrl();
            String skillUrl2 = notificationSound.getSkillUrl();
            return skillUrl != null ? skillUrl.equals(skillUrl2) : skillUrl2 == null;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getFolder() {
            return this.folder;
        }

        public String getId() {
            return this.id;
        }

        public int getNumAssets() {
            return this.numAssets;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getSampleUrl() {
            return this.sampleUrl;
        }

        public String getSampleVideoUrl() {
            return this.sampleVideoUrl;
        }

        public String getSkillUrl() {
            return this.skillUrl;
        }

        public int hashCode() {
            int numAssets = getNumAssets() + (((isChildDirected() ? 79 : 97) + 59) * 59);
            String id = getId();
            int hashCode = (numAssets * 59) + (id == null ? 43 : id.hashCode());
            String providerId = getProviderId();
            int hashCode2 = (hashCode * 59) + (providerId == null ? 43 : providerId.hashCode());
            String displayName = getDisplayName();
            int hashCode3 = (hashCode2 * 59) + (displayName == null ? 43 : displayName.hashCode());
            String sampleUrl = getSampleUrl();
            int hashCode4 = (hashCode3 * 59) + (sampleUrl == null ? 43 : sampleUrl.hashCode());
            String sampleVideoUrl = getSampleVideoUrl();
            int hashCode5 = (hashCode4 * 59) + (sampleVideoUrl == null ? 43 : sampleVideoUrl.hashCode());
            String folder = getFolder();
            int i = hashCode5 * 59;
            int hashCode6 = folder == null ? 43 : folder.hashCode();
            String skillUrl = getSkillUrl();
            return ((i + hashCode6) * 59) + (skillUrl != null ? skillUrl.hashCode() : 43);
        }

        public boolean isChildDirected() {
            return this.isChildDirected;
        }

        public void setChildDirected(boolean z) {
            this.isChildDirected = z;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setFolder(String str) {
            this.folder = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setNumAssets(int i) {
            this.numAssets = i;
        }

        public void setProviderId(String str) {
            this.providerId = str;
        }

        public void setSampleUrl(String str) {
            this.sampleUrl = str;
        }

        public void setSampleVideoUrl(String str) {
            this.sampleVideoUrl = str;
        }

        public void setSkillUrl(String str) {
            this.skillUrl = str;
        }

        public String toString() {
            return "RemindersNotification.NotificationSound(id=" + getId() + ", providerId=" + getProviderId() + ", displayName=" + getDisplayName() + ", sampleUrl=" + getSampleUrl() + ", sampleVideoUrl=" + getSampleVideoUrl() + ", folder=" + getFolder() + ", isChildDirected=" + isChildDirected() + ", numAssets=" + getNumAssets() + ", skillUrl=" + getSkillUrl() + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public NotificationSound() {
        }
    }
}
