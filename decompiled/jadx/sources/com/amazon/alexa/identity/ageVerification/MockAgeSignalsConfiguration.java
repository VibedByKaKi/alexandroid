package com.amazon.alexa.identity.ageVerification;

import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.google.android.play.agesignals.testing.FakeAgeSignalsManager;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class MockAgeSignalsConfiguration {
    private static final String FAKE_INSTALL_ID = "fake_install_id";
    private static final String TAG = "MockAgeSignalsConfig";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.identity.ageVerification.MockAgeSignalsConfiguration$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario;

        static {
            int[] iArr = new int[AgeComplianceMockScenario.values().length];
            $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario = iArr;
            try {
                iArr[AgeComplianceMockScenario.VERIFIED_ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.SUPERVISED_TEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.SUPERVISED_CHILD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.UNKNOWN_USER_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.APPROVAL_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.APPROVAL_DENIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.NETWORK_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.API_UNAVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.PLAY_STORE_NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.APP_NOT_OWNED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[AgeComplianceMockScenario.CONTROL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static void configure(FakeAgeSignalsManager fakeAgeSignalsManager, AgeComplianceMockScenario ageComplianceMockScenario) {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$identity$ageVerification$AgeComplianceMockScenario[ageComplianceMockScenario.ordinal()]) {
            case 1:
                configureVerifiedAdult(fakeAgeSignalsManager);
                break;
            case 2:
                configureSupervisedTeen(fakeAgeSignalsManager);
                break;
            case 3:
                configureSupervisedChild(fakeAgeSignalsManager);
                break;
            case 4:
                configureUnknownUser(fakeAgeSignalsManager);
                break;
            case 5:
                configureApprovalPending(fakeAgeSignalsManager);
                break;
            case 6:
                configureApprovalDenied(fakeAgeSignalsManager);
                break;
            case 7:
                configureNetworkError(fakeAgeSignalsManager);
                break;
            case 8:
                configureApiUnavailable(fakeAgeSignalsManager);
                break;
            case 9:
                configurePlayStoreNotFound(fakeAgeSignalsManager);
                break;
            case 10:
                configureAppNotOwned(fakeAgeSignalsManager);
                break;
        }
    }

    private static void configureApiUnavailable(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsException(new AgeSignalsException(-1));
    }

    private static void configureAppNotOwned(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsException(new AgeSignalsException(-9));
    }

    private static void configureApprovalDenied(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(3).setAgeLower(13).setAgeUpper(17).setMostRecentApprovalDate(Date.from(LocalDate.now().minusDays(3L).atStartOfDay(ZoneOffset.UTC).toInstant())).setInstallId(FAKE_INSTALL_ID).build());
    }

    private static void configureApprovalPending(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(2).setAgeLower(13).setAgeUpper(17).setInstallId(FAKE_INSTALL_ID).build());
    }

    private static void configureNetworkError(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsException(new AgeSignalsException(-3));
    }

    private static void configurePlayStoreNotFound(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsException(new AgeSignalsException(-2));
    }

    private static void configureSupervisedChild(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(1).setAgeLower(0).setAgeUpper(12).setInstallId(FAKE_INSTALL_ID).build());
    }

    private static void configureSupervisedTeen(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(1).setAgeLower(13).setAgeUpper(17).setInstallId(FAKE_INSTALL_ID).build());
    }

    private static void configureUnknownUser(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(4).build());
    }

    private static void configureVerifiedAdult(FakeAgeSignalsManager fakeAgeSignalsManager) {
        fakeAgeSignalsManager.setNextAgeSignalsResult(AgeSignalsResult.builder().setUserStatus(0).build());
    }
}
