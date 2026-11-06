package com.amazon.alexa.handsfree.ui.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.ui.R;
import com.amazon.alexa.handsfree.ui.utils.FontAdapter;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.MotoIOComponentsStateProvider;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.QualcommIOComponentsStateProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HandsFreeLogoBarProvider {
    private static final String TAG = "HandsFreeLogoBarProvider";
    private final View mLogoBarView;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'METRO' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LogoProvider {
        private static final /* synthetic */ LogoProvider[] $VALUES;
        public static final LogoProvider METRO;
        public static final LogoProvider MOTOROLA;
        public static final LogoProvider QUALCOMM;
        private final int mMosaicLogoID;
        private final String mPackageName;

        private static /* synthetic */ LogoProvider[] $values() {
            return new LogoProvider[]{METRO, MOTOROLA, QUALCOMM};
        }

        static {
            int i = R.drawable.ic_metro_logo;
            METRO = new LogoProvider("METRO", 0, "com.magiear.handsfree.assistant", i, i);
            MOTOROLA = new LogoProvider("MOTOROLA", 1, MotoIOComponentsStateProvider.MOTOALEXA_PACKAGE_NAME, R.drawable.ic_moto_logo, R.drawable.mosaic_ic_moto_logo);
            QUALCOMM = new LogoProvider("QUALCOMM", 2, QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME, R.drawable.ic_provider_logo, R.drawable.mosaic_ic_qualcomm_logo);
            $VALUES = $values();
        }

        private LogoProvider(@NonNull String str, @DrawableRes int i, @DrawableRes String str2, int i2, int i3) {
            this.mPackageName = str2;
            this.mMosaicLogoID = i3;
        }

        public static LogoProvider valueOf(String str) {
            return (LogoProvider) Enum.valueOf(LogoProvider.class, str);
        }

        public static LogoProvider[] values() {
            return (LogoProvider[]) $VALUES.clone();
        }

        @NonNull
        @DrawableRes
        public int getMosaicLogoID() {
            return this.mMosaicLogoID;
        }

        @NonNull
        public String getPackageName() {
            return this.mPackageName;
        }
    }

    public HandsFreeLogoBarProvider(@NonNull Context context) {
        this(View.inflate(context, R.layout.alexa_handsfree_logo_bar, null));
    }

    private void setupUI(@DrawableRes int i, @NonNull ImageView imageView) {
        FontAdapter.setFont(FontAdapter.FontName.AmazonEmberDisplay_Light, this.mLogoBarView.findViewById(R.id.logo_title_text));
        if (i != -1) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageDrawable(null);
            this.mLogoBarView.findViewById(R.id.logo_line).setVisibility(4);
        }
    }

    @NonNull
    public View getHandsFreeLogoBarMosaic(@Nullable String str) {
        Log.d(TAG, "getHandsFreeLogoBarMosaic: partner package name is " + str);
        ImageView imageView = (ImageView) this.mLogoBarView.findViewById(R.id.provider_logo);
        this.mLogoBarView.findViewById(R.id.logo_line).setBackgroundColor(com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral10);
        setupUI(getMosaicPartnerLogoID(str), imageView);
        return this.mLogoBarView;
    }

    @DrawableRes
    public int getMosaicPartnerLogoID(@Nullable String str) {
        for (LogoProvider logoProvider : LogoProvider.values()) {
            if (logoProvider.getPackageName().equals(str)) {
                return logoProvider.getMosaicLogoID();
            }
        }
        return -1;
    }

    @VisibleForTesting
    public HandsFreeLogoBarProvider(@NonNull View view) {
        this.mLogoBarView = view;
    }
}
