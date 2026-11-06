package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import android.icu.util.ULocale;
import androidx.annotation.RequiresApi;
import com.facebook.hermes.intl.IPlatformCollator;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PlatformCollatorICU implements IPlatformCollator {
    private RuleBasedCollator mCollator = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.facebook.hermes.intl.PlatformCollatorICU$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$CaseFirst;
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity;

        static {
            int[] iArr = new int[IPlatformCollator.CaseFirst.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$CaseFirst = iArr;
            try {
                iArr[IPlatformCollator.CaseFirst.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$CaseFirst[IPlatformCollator.CaseFirst.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$CaseFirst[IPlatformCollator.CaseFirst.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IPlatformCollator.Sensitivity.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity = iArr2;
            try {
                iArr2[IPlatformCollator.Sensitivity.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public int compare(String str, String str2) {
        return this.mCollator.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator configure(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((LocaleObjectICU) iLocaleObject).getLocale());
        this.mCollator = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (ULocale uLocale : ULocale.getAvailableLocales()) {
            arrayList.add(uLocale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator.Sensitivity getSensitivity() {
        RuleBasedCollator ruleBasedCollator = this.mCollator;
        if (ruleBasedCollator == null) {
            return IPlatformCollator.Sensitivity.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? this.mCollator.isCaseLevel() ? IPlatformCollator.Sensitivity.CASE : IPlatformCollator.Sensitivity.BASE : strength == 1 ? IPlatformCollator.Sensitivity.ACCENT : IPlatformCollator.Sensitivity.VARIANT;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator setCaseFirstAttribute(IPlatformCollator.CaseFirst caseFirst) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformCollator$CaseFirst[caseFirst.ordinal()];
        if (i == 1) {
            this.mCollator.setUpperCaseFirst(true);
            return this;
        }
        RuleBasedCollator ruleBasedCollator = this.mCollator;
        if (i != 2) {
            ruleBasedCollator.setCaseFirstDefault();
            return this;
        }
        ruleBasedCollator.setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator setIgnorePunctuation(boolean z) {
        if (z) {
            this.mCollator.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator setNumericAttribute(boolean z) {
        if (z) {
            this.mCollator.setNumericCollation(JSObjects.getJavaBoolean(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    public IPlatformCollator setSensitivity(IPlatformCollator.Sensitivity sensitivity) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[sensitivity.ordinal()];
        if (i == 1) {
            this.mCollator.setStrength(0);
            return this;
        }
        if (i == 2) {
            this.mCollator.setStrength(1);
            return this;
        }
        if (i == 3) {
            this.mCollator.setStrength(0);
            this.mCollator.setCaseLevel(true);
            return this;
        }
        if (i != 4) {
            return this;
        }
        this.mCollator.setStrength(2);
        return this;
    }
}
