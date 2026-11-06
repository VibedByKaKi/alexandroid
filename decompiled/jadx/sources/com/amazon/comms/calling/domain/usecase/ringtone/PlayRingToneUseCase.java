package com.amazon.comms.calling.domain.usecase.ringtone;

import android.content.Context;
import android.provider.Settings;
import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.model.RingtoneParams;
import com.amazon.comms.calling.domain.repo.RingtoneRepository;
import com.amazon.comms.calling.domain.usecase.CoroutineUseCase;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.infrastructure.RingtoneType;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/ringtone/PlayRingToneUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "Lcom/amazon/comms/calling/domain/model/RingtoneParams;", "", "context", "Landroid/content/Context;", "ringtoneRepository", "Lcom/amazon/comms/calling/domain/repo/RingtoneRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lcom/amazon/comms/calling/domain/repo/RingtoneRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "DND_MODE", "", "DND_OFF", "", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "parameters", "(Lcom/amazon/comms/calling/domain/model/RingtoneParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDNDMode", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PlayRingToneUseCase extends CoroutineUseCase<RingtoneParams, Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(PlayRingToneUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    @NotNull
    private final String DND_MODE;
    private final int DND_OFF;

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final RingtoneRepository ringtoneRepository;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RingtoneType.values().length];
            try {
                iArr[RingtoneType.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RingtoneType.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PlayRingToneUseCase(@NotNull Context context, @NotNull RingtoneRepository ringtoneRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        context.getClass();
        ringtoneRepository.getClass();
        coroutineDispatcher.getClass();
        this.context = context;
        this.ringtoneRepository = ringtoneRepository;
        this.dispatcher = coroutineDispatcher;
        this.DND_MODE = Constants.DND_MODE;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean isDNDMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), this.DND_MODE) != this.DND_OFF;
        } catch (Settings.SettingNotFoundException unused) {
            this.getLOG().e("Unable to determine DND Mode");
            return false;
        }
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull RingtoneParams ringtoneParams, @NotNull Continuation<? super Unit> continuation) {
        if (isDNDMode()) {
            getLOG().i("Cannot play ringtone as we are in DND mode");
        } else {
            getLOG().i("calling_ringtone_incoming");
            if (!ringtoneParams.isDropIn()) {
                int i = WhenMappings.$EnumSwitchMapping$0[ringtoneParams.getRingtoneType().ordinal()];
                if (i == 1) {
                    this.ringtoneRepository.playIncomingRingtone();
                } else if (i == 2) {
                    this.ringtoneRepository.playOutgoingRingtone();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
