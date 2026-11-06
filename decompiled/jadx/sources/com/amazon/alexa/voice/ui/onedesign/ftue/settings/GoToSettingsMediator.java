package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.internal.Preconditions;
import org.jetbrains.kotlin.library.KotlinLibraryKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GoToSettingsMediator implements GoToSettingsContract.Mediator {
    private final ViewController controller;
    private final ActivityStarter starter;

    public GoToSettingsMediator(@NonNull ViewController viewController, @NonNull ActivityStarter activityStarter) {
        Preconditions.nonNull(viewController, "controller argument must be non-null.");
        Preconditions.nonNull(activityStarter, "starter argument must be non-null.");
        this.controller = viewController;
        this.starter = activityStarter;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract.Mediator
    public void openSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts(KotlinLibraryKt.KLIB_PROPERTY_PACKAGE, this.controller.getContext().getPackageName(), null));
        this.starter.startActivityForResult(intent, 0);
    }
}
