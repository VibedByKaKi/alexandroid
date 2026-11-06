package com.amazon.alexa.client.alexaservice.audio.core;

import android.content.Context;
import android.media.SoundPool;
import android.util.SparseArray;
import dagger.Lazy;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class SoundWrapper implements SoundPool.OnLoadCompleteListener {
    static final String SCO_SOUND_WRAPPER = "ScoSoundWrapper";
    private static final String TAG = "SoundWrapper";
    private final Context context;
    private final SparseArray<Sound> idToSounds = new SparseArray<>();
    private final Map<SoundName, Sound> nameToSounds = new HashMap();
    private final Lazy<SoundPool> soundPool;

    @Inject
    public SoundWrapper(Lazy<SoundPool> lazy, Context context) {
        this.soundPool = lazy;
        this.context = context;
    }

    private void setLoaded(int i, int i2) {
        Sound sound = this.idToSounds.get(i);
        if (sound != null) {
            sound.setLoaded(i2 == 0);
        }
    }

    public Sound getSound(SoundName soundName) {
        return this.nameToSounds.get(soundName);
    }

    public void loadSounds() {
        this.soundPool.get().setOnLoadCompleteListener(this);
        for (SoundName soundName : SoundName.values()) {
            int load = this.soundPool.get().load(this.context, soundName.getResourceId(), 0);
            Sound sound = new Sound(soundName, load);
            this.idToSounds.put(load, sound);
            this.nameToSounds.put(soundName, sound);
        }
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        setLoaded(i, i2);
    }

    public int play(SoundName soundName, boolean z) {
        return this.soundPool.get().play(this.nameToSounds.get(soundName).getId(), 1.0f, 1.0f, 0, z ? -1 : 0, 1.0001f);
    }

    public void stop(int i) {
        if (i != -1) {
            this.soundPool.get().stop(i);
        }
    }

    public void teardown() {
        this.soundPool.get().release();
    }
}
