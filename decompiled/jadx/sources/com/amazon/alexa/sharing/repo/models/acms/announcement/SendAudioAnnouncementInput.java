package com.amazon.alexa.sharing.repo.models.acms.announcement;

import androidx.annotation.Nullable;
import com.amazon.alexa.sharing.repo.models.acms.announcement.enums.SoundEffect;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SendAudioAnnouncementInput {
    private String filePath;
    private String firstName;
    private String lastName;
    private int mediaLength;

    @Nullable
    private SoundEffect[] soundEffects;

    public String getFilePath() {
        return this.filePath;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getMediaLength() {
        return this.mediaLength;
    }

    public SoundEffect[] getSoundEffects() {
        return this.soundEffects;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setMediaLength(int i) {
        this.mediaLength = i;
    }

    public void setSoundEffects(SoundEffect[] soundEffectArr) {
        this.soundEffects = soundEffectArr;
    }
}
