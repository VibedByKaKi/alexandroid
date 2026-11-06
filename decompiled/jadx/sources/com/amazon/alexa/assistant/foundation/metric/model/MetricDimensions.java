package com.amazon.alexa.assistant.foundation.metric.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0003\b¦\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 í\u00012\u00020\u0001:\u0006ë\u0001ì\u0001í\u0001Bß\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b8\u00109B\u0097\u0004\b\u0010\u0012\u0006\u0010:\u001a\u00020\u0014\u0012\u0006\u0010;\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0016\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u000f\u0012\b\u00107\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010<\u001a\u0004\u0018\u00010=¢\u0006\u0004\b8\u0010>J\t\u0010«\u0001\u001a\u00020\u0003H\u0016J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010·\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010gJ\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\u0011\u0010Á\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010gJ\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010gJ\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ü\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJ\u0011\u0010Ý\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010YJè\u0004\u0010Þ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0003\u0010ß\u0001J\u0015\u0010à\u0001\u001a\u00020\u00162\t\u0010á\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010â\u0001\u001a\u00020\u0014HÖ\u0001J-\u0010ã\u0001\u001a\u00030ä\u00012\u0007\u0010å\u0001\u001a\u00020\u00002\b\u0010æ\u0001\u001a\u00030ç\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0001¢\u0006\u0003\bê\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010@\u001a\u0004\bL\u0010BR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010@\u001a\u0004\bN\u0010BR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010@\u001a\u0004\bP\u0010BR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010@\u001a\u0004\bR\u0010BR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010@\u001a\u0004\bT\u0010BR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010@\u001a\u0004\bV\u0010BR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010Z\u0012\u0004\bW\u0010@\u001a\u0004\bX\u0010YR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010@\u001a\u0004\b\\\u0010BR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010@\u001a\u0004\b^\u0010BR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010@\u001a\u0004\b`\u0010BR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010d\u0012\u0004\ba\u0010@\u001a\u0004\bb\u0010cR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\be\u0010@\u001a\u0004\bf\u0010gR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u0010@\u001a\u0004\bj\u0010BR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u0010@\u001a\u0004\bl\u0010BR \u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010Z\u0012\u0004\bm\u0010@\u001a\u0004\bn\u0010YR \u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010Z\u0012\u0004\bo\u0010@\u001a\u0004\bp\u0010YR \u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010Z\u0012\u0004\bq\u0010@\u001a\u0004\br\u0010YR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010@\u001a\u0004\bt\u0010BR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010@\u001a\u0004\bv\u0010BR \u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010Z\u0012\u0004\bw\u0010@\u001a\u0004\bx\u0010YR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010@\u001a\u0004\bz\u0010BR\u001e\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010@\u001a\u0004\b|\u0010BR\u001e\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010@\u001a\u0004\b~\u0010BR\u001f\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u0010@\u001a\u0005\b\u0080\u0001\u0010BR \u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0001\u0010@\u001a\u0005\b\u0082\u0001\u0010BR \u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0083\u0001\u0010@\u001a\u0005\b\u0084\u0001\u0010BR \u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010@\u001a\u0005\b\u0086\u0001\u0010BR \u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0001\u0010@\u001a\u0005\b\u0088\u0001\u0010BR \u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u0010@\u001a\u0005\b\u008a\u0001\u0010BR \u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010@\u001a\u0005\b\u008c\u0001\u0010BR \u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008d\u0001\u0010@\u001a\u0005\b\u008e\u0001\u0010BR \u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008f\u0001\u0010@\u001a\u0005\b\u0090\u0001\u0010BR \u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0091\u0001\u0010@\u001a\u0005\b\u0092\u0001\u0010BR\"\u0010,\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010h\u0012\u0005\b\u0093\u0001\u0010@\u001a\u0005\b\u0094\u0001\u0010gR \u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0095\u0001\u0010@\u001a\u0005\b\u0096\u0001\u0010BR \u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0097\u0001\u0010@\u001a\u0005\b\u0098\u0001\u0010BR \u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0099\u0001\u0010@\u001a\u0005\b\u009a\u0001\u0010BR \u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009b\u0001\u0010@\u001a\u0005\b\u009c\u0001\u0010BR \u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009d\u0001\u0010@\u001a\u0005\b\u009e\u0001\u0010BR\"\u00102\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010h\u0012\u0005\b\u009f\u0001\u0010@\u001a\u0005\b \u0001\u0010gR \u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¡\u0001\u0010@\u001a\u0005\b¢\u0001\u0010BR \u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b£\u0001\u0010@\u001a\u0005\b¤\u0001\u0010BR \u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¥\u0001\u0010@\u001a\u0005\b¦\u0001\u0010BR\"\u00106\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010Z\u0012\u0005\b§\u0001\u0010@\u001a\u0005\b¨\u0001\u0010YR\"\u00107\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010Z\u0012\u0005\b©\u0001\u0010@\u001a\u0005\bª\u0001\u0010Y¨\u0006î\u0001"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "", "dialogRequestId", "", "conversationId", "invocationNamespace", "invocationIdentifier", "invocationType", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "interactionLabel", "action", "responseType", AlexaMetricsConstants.AssistantSdkDimensions.AVS_ENDPOINT, "fileExtension", MetricsConstants.Type.FILE_SIZE, "", "appState", "eventSource", "uri", FragmentMetaData.REVISION, "", FragmentMetaData.PENDING_UPDATE, "", "messageId", "mode", "fileCount", "nodeCount", "retryFileCount", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "resultCode", "pollCycleCount", "muteActive", "wakeword", "version", "locale", Content.SCHEMA, "secondaryLocales", "timezone", "status", "access", "url", "outcome", "reason", "settingName", "enabled", AlexaMetricsConstants.AssistantSdkDimensions.RENDER_FAILURE_CATEGORY, AlexaMetricsConstants.AssistantSdkDimensions.ADD_FRAGMENT_STATE, AlexaMetricsConstants.AssistantSdkDimensions.INTERACTION_MODEL_STATE, AlexaMetricsConstants.AssistantSdkDimensions.INTERACTION_SOURCE, AlexaMetricsConstants.AssistantSdkDimensions.DIALOG_STATUS, AlexaMetricsConstants.AssistantSdkDimensions.NDD_IS_ENABLED, AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_CATEGORY, "errorCode", "oldDialogRequestId", "upstreamClientUpl", "downstreamClientUpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDialogRequestId$annotations", "()V", "getDialogRequestId", "()Ljava/lang/String;", "getConversationId$annotations", "getConversationId", "getInvocationNamespace$annotations", "getInvocationNamespace", "getInvocationIdentifier$annotations", "getInvocationIdentifier", "getInvocationType$annotations", "getInvocationType", "getInitiator$annotations", "getInitiator", "getInteractionLabel$annotations", "getInteractionLabel", "getAction$annotations", "getAction", "getResponseType$annotations", "getResponseType", "getAvsEndpoint$annotations", "getAvsEndpoint", "getFileExtension$annotations", "getFileExtension", "getFileSize$annotations", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAppState$annotations", "getAppState", "getEventSource$annotations", "getEventSource", "getUri$annotations", "getUri", "getRevision$annotations", "getRevision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPendingUpdate$annotations", "getPendingUpdate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessageId$annotations", "getMessageId", "getMode$annotations", "getMode", "getFileCount$annotations", "getFileCount", "getNodeCount$annotations", "getNodeCount", "getRetryFileCount$annotations", "getRetryFileCount", "getFailureReason$annotations", "getFailureReason", "getResultCode$annotations", "getResultCode", "getPollCycleCount$annotations", "getPollCycleCount", "getMuteActive$annotations", "getMuteActive", "getWakeword$annotations", "getWakeword", "getVersion$annotations", "getVersion", "getLocale$annotations", "getLocale", "getSchema$annotations", "getSchema", "getSecondaryLocales$annotations", "getSecondaryLocales", "getTimezone$annotations", "getTimezone", "getStatus$annotations", "getStatus", "getAccess$annotations", "getAccess", "getUrl$annotations", "getUrl", "getOutcome$annotations", "getOutcome", "getReason$annotations", "getReason", "getSettingName$annotations", "getSettingName", "getEnabled$annotations", "getEnabled", "getRenderFailureCategory$annotations", "getRenderFailureCategory", "getAddFragmentState$annotations", "getAddFragmentState", "getInteractionModelState$annotations", "getInteractionModelState", "getInteractionSource$annotations", "getInteractionSource", "getDialogStatus$annotations", "getDialogStatus", "getNddIsEnabled$annotations", "getNddIsEnabled", "getFailureCategory$annotations", "getFailureCategory", "getErrorCode$annotations", "getErrorCode", "getOldDialogRequestId$annotations", "getOldDialogRequestId", "getUpstreamClientUpl$annotations", "getUpstreamClientUpl", "getDownstreamClientUpl$annotations", "getDownstreamClientUpl", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$foundation_release", "Builder", "$serializer", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension({"SMAP\nMetricDimensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricDimensions.kt\ncom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
/* loaded from: classes15.dex */
public final /* data */ class MetricDimensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String access;

    @Nullable
    private final String action;

    @Nullable
    private final String addFragmentState;

    @Nullable
    private final String appState;

    @Nullable
    private final String avsEndpoint;

    @Nullable
    private final String conversationId;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String dialogStatus;

    @Nullable
    private final Long downstreamClientUpl;

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final String errorCode;

    @Nullable
    private final String eventSource;

    @Nullable
    private final String failureCategory;

    @Nullable
    private final String failureReason;

    @Nullable
    private final Long fileCount;

    @Nullable
    private final String fileExtension;

    @Nullable
    private final Long fileSize;

    @Nullable
    private final String initiator;

    @Nullable
    private final String interactionLabel;

    @Nullable
    private final String interactionModelState;

    @Nullable
    private final String interactionSource;

    @Nullable
    private final String invocationIdentifier;

    @Nullable
    private final String invocationNamespace;

    @Nullable
    private final String invocationType;

    @Nullable
    private final String locale;

    @Nullable
    private final String messageId;

    @Nullable
    private final String mode;

    @Nullable
    private final String muteActive;

    @Nullable
    private final Boolean nddIsEnabled;

    @Nullable
    private final Long nodeCount;

    @Nullable
    private final String oldDialogRequestId;

    @Nullable
    private final String outcome;

    @Nullable
    private final Boolean pendingUpdate;

    @Nullable
    private final Long pollCycleCount;

    @Nullable
    private final String reason;

    @Nullable
    private final String renderFailureCategory;

    @Nullable
    private final String responseType;

    @Nullable
    private final String resultCode;

    @Nullable
    private final Long retryFileCount;

    @Nullable
    private final Integer revision;

    @Nullable
    private final String schema;

    @Nullable
    private final String secondaryLocales;

    @Nullable
    private final String settingName;

    @Nullable
    private final String status;

    @Nullable
    private final String timezone;

    @Nullable
    private final Long upstreamClientUpl;

    @Nullable
    private final String uri;

    @Nullable
    private final String url;

    @Nullable
    private final String version;

    @Nullable
    private final String wakeword;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bi\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010©\u0001\u001a\u00030ª\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001e\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR\u001c\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001e\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001c\u0010I\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001e\u0010L\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\u001e\u0010O\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R\u001e\u0010R\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bS\u0010+\"\u0004\bT\u0010-R\u001c\u0010U\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR\u001c\u0010X\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\tR\u001e\u0010[\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\u001c\u0010^\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR\u001c\u0010a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010\tR\u001c\u0010d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0007\"\u0004\bf\u0010\tR\u001c\u0010g\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0007\"\u0004\bi\u0010\tR\u001c\u0010j\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0007\"\u0004\bl\u0010\tR\u001c\u0010m\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0007\"\u0004\bo\u0010\tR\u001c\u0010p\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0007\"\u0004\br\u0010\tR\u001c\u0010s\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0007\"\u0004\bu\u0010\tR\u001c\u0010v\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0007\"\u0004\bx\u0010\tR\u001c\u0010y\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0007\"\u0004\b{\u0010\tR\u001c\u0010|\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0007\"\u0004\b~\u0010\tR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0007\"\u0005\b\u0081\u0001\u0010\tR\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0007\"\u0005\b\u0084\u0001\u0010\tR!\u0010\u0085\u0001\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0012\n\u0002\u0010E\u001a\u0005\b\u0086\u0001\u0010B\"\u0005\b\u0087\u0001\u0010DR\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0007\"\u0005\b\u008a\u0001\u0010\tR\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0007\"\u0005\b\u008d\u0001\u0010\tR\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0007\"\u0005\b\u0090\u0001\u0010\tR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0007\"\u0005\b\u0093\u0001\u0010\tR\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u0007\"\u0005\b\u0096\u0001\u0010\tR!\u0010\u0097\u0001\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0012\n\u0002\u0010E\u001a\u0005\b\u0098\u0001\u0010B\"\u0005\b\u0099\u0001\u0010DR\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u0007\"\u0005\b\u009c\u0001\u0010\tR\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0007\"\u0005\b\u009f\u0001\u0010\tR\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010\u0007\"\u0005\b¢\u0001\u0010\tR!\u0010£\u0001\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0012\n\u0002\u0010.\u001a\u0005\b¤\u0001\u0010+\"\u0005\b¥\u0001\u0010-R!\u0010¦\u0001\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0012\n\u0002\u0010.\u001a\u0005\b§\u0001\u0010+\"\u0005\b¨\u0001\u0010-¨\u0006«\u0001"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions$Builder;", "", "<init>", "()V", "dialogRequestId", "", "getDialogRequestId", "()Ljava/lang/String;", "setDialogRequestId", "(Ljava/lang/String;)V", "conversationId", "getConversationId", "setConversationId", "invocationNamespace", "getInvocationNamespace", "setInvocationNamespace", "invocationIdentifier", "getInvocationIdentifier", "setInvocationIdentifier", "invocationType", "getInvocationType", "setInvocationType", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "getInitiator", "setInitiator", "interactionLabel", "getInteractionLabel", "setInteractionLabel", "action", "getAction", "setAction", "responseType", "getResponseType", "setResponseType", AlexaMetricsConstants.AssistantSdkDimensions.AVS_ENDPOINT, "getAvsEndpoint", "setAvsEndpoint", "fileExtension", "getFileExtension", "setFileExtension", MetricsConstants.Type.FILE_SIZE, "", "getFileSize", "()Ljava/lang/Long;", "setFileSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "appState", "getAppState", "setAppState", "eventSource", "getEventSource", "setEventSource", "uri", "getUri", "setUri", FragmentMetaData.REVISION, "", "getRevision", "()Ljava/lang/Integer;", "setRevision", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", FragmentMetaData.PENDING_UPDATE, "", "getPendingUpdate", "()Ljava/lang/Boolean;", "setPendingUpdate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "messageId", "getMessageId", "setMessageId", "mode", "getMode", "setMode", "fileCount", "getFileCount", "setFileCount", "nodeCount", "getNodeCount", "setNodeCount", "retryFileCount", "getRetryFileCount", "setRetryFileCount", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "getFailureReason", "setFailureReason", "resultCode", "getResultCode", "setResultCode", "pollCycleCount", "getPollCycleCount", "setPollCycleCount", "muteActive", "getMuteActive", "setMuteActive", "wakeword", "getWakeword", "setWakeword", "version", "getVersion", "setVersion", "locale", "getLocale", "setLocale", Content.SCHEMA, "getSchema", "setSchema", "secondaryLocales", "getSecondaryLocales", "setSecondaryLocales", "timezone", "getTimezone", "setTimezone", "status", "getStatus", "setStatus", "access", "getAccess", "setAccess", "url", "getUrl", "setUrl", "outcome", "getOutcome", "setOutcome", "reason", "getReason", "setReason", "settingName", "getSettingName", "setSettingName", "enabled", "getEnabled", "setEnabled", AlexaMetricsConstants.AssistantSdkDimensions.RENDER_FAILURE_CATEGORY, "getRenderFailureCategory", "setRenderFailureCategory", AlexaMetricsConstants.AssistantSdkDimensions.ADD_FRAGMENT_STATE, "getAddFragmentState", "setAddFragmentState", AlexaMetricsConstants.AssistantSdkDimensions.INTERACTION_MODEL_STATE, "getInteractionModelState", "setInteractionModelState", AlexaMetricsConstants.AssistantSdkDimensions.INTERACTION_SOURCE, "getInteractionSource", "setInteractionSource", AlexaMetricsConstants.AssistantSdkDimensions.DIALOG_STATUS, "getDialogStatus", "setDialogStatus", AlexaMetricsConstants.AssistantSdkDimensions.NDD_IS_ENABLED, "getNddIsEnabled", "setNddIsEnabled", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_CATEGORY, "getFailureCategory", "setFailureCategory", "errorCode", "getErrorCode", "setErrorCode", "oldDialogRequestId", "getOldDialogRequestId", "setOldDialogRequestId", "upstreamClientUpl", "getUpstreamClientUpl", "setUpstreamClientUpl", "downstreamClientUpl", "getDownstreamClientUpl", "setDownstreamClientUpl", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String access;

        @Nullable
        private String action;

        @Nullable
        private String addFragmentState;

        @Nullable
        private String appState;

        @Nullable
        private String avsEndpoint;

        @Nullable
        private String conversationId;

        @Nullable
        private String dialogRequestId;

        @Nullable
        private String dialogStatus;

        @Nullable
        private Long downstreamClientUpl;

        @Nullable
        private Boolean enabled;

        @Nullable
        private String errorCode;

        @Nullable
        private String eventSource;

        @Nullable
        private String failureCategory;

        @Nullable
        private String failureReason;

        @Nullable
        private Long fileCount;

        @Nullable
        private String fileExtension;

        @Nullable
        private Long fileSize;

        @Nullable
        private String initiator;

        @Nullable
        private String interactionLabel;

        @Nullable
        private String interactionModelState;

        @Nullable
        private String interactionSource;

        @Nullable
        private String invocationIdentifier;

        @Nullable
        private String invocationNamespace;

        @Nullable
        private String invocationType;

        @Nullable
        private String locale;

        @Nullable
        private String messageId;

        @Nullable
        private String mode;

        @Nullable
        private String muteActive;

        @Nullable
        private Boolean nddIsEnabled;

        @Nullable
        private Long nodeCount;

        @Nullable
        private String oldDialogRequestId;

        @Nullable
        private String outcome;

        @Nullable
        private Boolean pendingUpdate;

        @Nullable
        private Long pollCycleCount;

        @Nullable
        private String reason;

        @Nullable
        private String renderFailureCategory;

        @Nullable
        private String responseType;

        @Nullable
        private String resultCode;

        @Nullable
        private Long retryFileCount;

        @Nullable
        private Integer revision;

        @Nullable
        private String schema;

        @Nullable
        private String secondaryLocales;

        @Nullable
        private String settingName;

        @Nullable
        private String status;

        @Nullable
        private String timezone;

        @Nullable
        private Long upstreamClientUpl;

        @Nullable
        private String uri;

        @Nullable
        private String url;

        @Nullable
        private String version;

        @Nullable
        private String wakeword;

        @NotNull
        public final MetricDimensions build() {
            return new MetricDimensions(this.dialogRequestId, this.conversationId, this.invocationNamespace, this.invocationIdentifier, this.invocationType, this.initiator, this.interactionLabel, this.action, this.responseType, this.avsEndpoint, this.fileExtension, this.fileSize, this.appState, this.eventSource, this.uri, this.revision, this.pendingUpdate, this.messageId, this.mode, this.fileCount, this.nodeCount, this.retryFileCount, this.failureReason, this.resultCode, this.pollCycleCount, this.muteActive, this.wakeword, this.version, this.locale, this.schema, this.secondaryLocales, this.timezone, this.status, this.access, this.url, this.outcome, this.reason, this.settingName, this.enabled, this.renderFailureCategory, this.addFragmentState, this.interactionModelState, this.interactionSource, this.dialogStatus, this.nddIsEnabled, this.failureCategory, this.errorCode, this.oldDialogRequestId, this.upstreamClientUpl, this.downstreamClientUpl);
        }

        @Nullable
        public final String getAccess() {
            return this.access;
        }

        @Nullable
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final String getAddFragmentState() {
            return this.addFragmentState;
        }

        @Nullable
        public final String getAppState() {
            return this.appState;
        }

        @Nullable
        public final String getAvsEndpoint() {
            return this.avsEndpoint;
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final String getDialogStatus() {
            return this.dialogStatus;
        }

        @Nullable
        public final Long getDownstreamClientUpl() {
            return this.downstreamClientUpl;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final String getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final String getEventSource() {
            return this.eventSource;
        }

        @Nullable
        public final String getFailureCategory() {
            return this.failureCategory;
        }

        @Nullable
        public final String getFailureReason() {
            return this.failureReason;
        }

        @Nullable
        public final Long getFileCount() {
            return this.fileCount;
        }

        @Nullable
        public final String getFileExtension() {
            return this.fileExtension;
        }

        @Nullable
        public final Long getFileSize() {
            return this.fileSize;
        }

        @Nullable
        public final String getInitiator() {
            return this.initiator;
        }

        @Nullable
        public final String getInteractionLabel() {
            return this.interactionLabel;
        }

        @Nullable
        public final String getInteractionModelState() {
            return this.interactionModelState;
        }

        @Nullable
        public final String getInteractionSource() {
            return this.interactionSource;
        }

        @Nullable
        public final String getInvocationIdentifier() {
            return this.invocationIdentifier;
        }

        @Nullable
        public final String getInvocationNamespace() {
            return this.invocationNamespace;
        }

        @Nullable
        public final String getInvocationType() {
            return this.invocationType;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final String getMessageId() {
            return this.messageId;
        }

        @Nullable
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final String getMuteActive() {
            return this.muteActive;
        }

        @Nullable
        public final Boolean getNddIsEnabled() {
            return this.nddIsEnabled;
        }

        @Nullable
        public final Long getNodeCount() {
            return this.nodeCount;
        }

        @Nullable
        public final String getOldDialogRequestId() {
            return this.oldDialogRequestId;
        }

        @Nullable
        public final String getOutcome() {
            return this.outcome;
        }

        @Nullable
        public final Boolean getPendingUpdate() {
            return this.pendingUpdate;
        }

        @Nullable
        public final Long getPollCycleCount() {
            return this.pollCycleCount;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getRenderFailureCategory() {
            return this.renderFailureCategory;
        }

        @Nullable
        public final String getResponseType() {
            return this.responseType;
        }

        @Nullable
        public final String getResultCode() {
            return this.resultCode;
        }

        @Nullable
        public final Long getRetryFileCount() {
            return this.retryFileCount;
        }

        @Nullable
        public final Integer getRevision() {
            return this.revision;
        }

        @Nullable
        public final String getSchema() {
            return this.schema;
        }

        @Nullable
        public final String getSecondaryLocales() {
            return this.secondaryLocales;
        }

        @Nullable
        public final String getSettingName() {
            return this.settingName;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        public final String getTimezone() {
            return this.timezone;
        }

        @Nullable
        public final Long getUpstreamClientUpl() {
            return this.upstreamClientUpl;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        public final String getWakeword() {
            return this.wakeword;
        }

        public final void setAccess(@Nullable String str) {
            this.access = str;
        }

        public final void setAction(@Nullable String str) {
            this.action = str;
        }

        public final void setAddFragmentState(@Nullable String str) {
            this.addFragmentState = str;
        }

        public final void setAppState(@Nullable String str) {
            this.appState = str;
        }

        public final void setAvsEndpoint(@Nullable String str) {
            this.avsEndpoint = str;
        }

        public final void setConversationId(@Nullable String str) {
            this.conversationId = str;
        }

        public final void setDialogRequestId(@Nullable String str) {
            this.dialogRequestId = str;
        }

        public final void setDialogStatus(@Nullable String str) {
            this.dialogStatus = str;
        }

        public final void setDownstreamClientUpl(@Nullable Long l) {
            this.downstreamClientUpl = l;
        }

        public final void setEnabled(@Nullable Boolean bool) {
            this.enabled = bool;
        }

        public final void setErrorCode(@Nullable String str) {
            this.errorCode = str;
        }

        public final void setEventSource(@Nullable String str) {
            this.eventSource = str;
        }

        public final void setFailureCategory(@Nullable String str) {
            this.failureCategory = str;
        }

        public final void setFailureReason(@Nullable String str) {
            this.failureReason = str;
        }

        public final void setFileCount(@Nullable Long l) {
            this.fileCount = l;
        }

        public final void setFileExtension(@Nullable String str) {
            this.fileExtension = str;
        }

        public final void setFileSize(@Nullable Long l) {
            this.fileSize = l;
        }

        public final void setInitiator(@Nullable String str) {
            this.initiator = str;
        }

        public final void setInteractionLabel(@Nullable String str) {
            this.interactionLabel = str;
        }

        public final void setInteractionModelState(@Nullable String str) {
            this.interactionModelState = str;
        }

        public final void setInteractionSource(@Nullable String str) {
            this.interactionSource = str;
        }

        public final void setInvocationIdentifier(@Nullable String str) {
            this.invocationIdentifier = str;
        }

        public final void setInvocationNamespace(@Nullable String str) {
            this.invocationNamespace = str;
        }

        public final void setInvocationType(@Nullable String str) {
            this.invocationType = str;
        }

        public final void setLocale(@Nullable String str) {
            this.locale = str;
        }

        public final void setMessageId(@Nullable String str) {
            this.messageId = str;
        }

        public final void setMode(@Nullable String str) {
            this.mode = str;
        }

        public final void setMuteActive(@Nullable String str) {
            this.muteActive = str;
        }

        public final void setNddIsEnabled(@Nullable Boolean bool) {
            this.nddIsEnabled = bool;
        }

        public final void setNodeCount(@Nullable Long l) {
            this.nodeCount = l;
        }

        public final void setOldDialogRequestId(@Nullable String str) {
            this.oldDialogRequestId = str;
        }

        public final void setOutcome(@Nullable String str) {
            this.outcome = str;
        }

        public final void setPendingUpdate(@Nullable Boolean bool) {
            this.pendingUpdate = bool;
        }

        public final void setPollCycleCount(@Nullable Long l) {
            this.pollCycleCount = l;
        }

        public final void setReason(@Nullable String str) {
            this.reason = str;
        }

        public final void setRenderFailureCategory(@Nullable String str) {
            this.renderFailureCategory = str;
        }

        public final void setResponseType(@Nullable String str) {
            this.responseType = str;
        }

        public final void setResultCode(@Nullable String str) {
            this.resultCode = str;
        }

        public final void setRetryFileCount(@Nullable Long l) {
            this.retryFileCount = l;
        }

        public final void setRevision(@Nullable Integer num) {
            this.revision = num;
        }

        public final void setSchema(@Nullable String str) {
            this.schema = str;
        }

        public final void setSecondaryLocales(@Nullable String str) {
            this.secondaryLocales = str;
        }

        public final void setSettingName(@Nullable String str) {
            this.settingName = str;
        }

        public final void setStatus(@Nullable String str) {
            this.status = str;
        }

        public final void setTimezone(@Nullable String str) {
            this.timezone = str;
        }

        public final void setUpstreamClientUpl(@Nullable Long l) {
            this.upstreamClientUpl = l;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        public final void setVersion(@Nullable String str) {
            this.version = str;
        }

        public final void setWakeword(@Nullable String str) {
            this.wakeword = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MetricDimensions(java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.Long r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.Integer r58, java.lang.Boolean r59, java.lang.String r60, java.lang.String r61, java.lang.Long r62, java.lang.Long r63, java.lang.Long r64, java.lang.String r65, java.lang.String r66, java.lang.Long r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.Boolean r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.Boolean r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.Long r91, java.lang.Long r92, int r93, int r94, kotlin.jvm.internal.DefaultConstructorMarker r95) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.foundation.metric.model.MetricDimensions.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$foundation_release(MetricDimensions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        String str = self.dialogRequestId;
        if (str != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
        }
        String str2 = self.conversationId;
        if (str2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
        }
        String str3 = self.invocationNamespace;
        if (str3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str3);
        }
        String str4 = self.invocationIdentifier;
        if (str4 != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str4);
        }
        String str5 = self.invocationType;
        if (str5 != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str5);
        }
        String str6 = self.initiator;
        if (str6 != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str6);
        }
        String str7 = self.interactionLabel;
        if (str7 != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str7);
        }
        String str8 = self.action;
        if (str8 != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str8);
        }
        String str9 = self.responseType;
        if (str9 != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str9);
        }
        String str10 = self.avsEndpoint;
        if (str10 != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str10);
        }
        String str11 = self.fileExtension;
        if (str11 != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str11);
        }
        Long l = self.fileSize;
        if (l != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, LongSerializer.INSTANCE, l);
        }
        String str12 = self.appState;
        if (str12 != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str12);
        }
        String str13 = self.eventSource;
        if (str13 != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str13);
        }
        String str14 = self.uri;
        if (str14 != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str14);
        }
        Integer num = self.revision;
        if (num != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, IntSerializer.INSTANCE, num);
        }
        Boolean bool = self.pendingUpdate;
        if (bool != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, bool);
        }
        String str15 = self.messageId;
        if (str15 != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, str15);
        }
        String str16 = self.mode;
        if (str16 != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, str16);
        }
        Long l2 = self.fileCount;
        if (l2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, LongSerializer.INSTANCE, l2);
        }
        Long l3 = self.nodeCount;
        if (l3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, LongSerializer.INSTANCE, l3);
        }
        Long l4 = self.retryFileCount;
        if (l4 != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, LongSerializer.INSTANCE, l4);
        }
        String str17 = self.failureReason;
        if (str17 != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, str17);
        }
        String str18 = self.resultCode;
        if (str18 != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, StringSerializer.INSTANCE, str18);
        }
        Long l5 = self.pollCycleCount;
        if (l5 != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, LongSerializer.INSTANCE, l5);
        }
        String str19 = self.muteActive;
        if (str19 != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, StringSerializer.INSTANCE, str19);
        }
        String str20 = self.wakeword;
        if (str20 != null) {
            output.encodeNullableSerializableElement(serialDesc, 26, StringSerializer.INSTANCE, str20);
        }
        String str21 = self.version;
        if (str21 != null) {
            output.encodeNullableSerializableElement(serialDesc, 27, StringSerializer.INSTANCE, str21);
        }
        String str22 = self.locale;
        if (str22 != null) {
            output.encodeNullableSerializableElement(serialDesc, 28, StringSerializer.INSTANCE, str22);
        }
        String str23 = self.schema;
        if (str23 != null) {
            output.encodeNullableSerializableElement(serialDesc, 29, StringSerializer.INSTANCE, str23);
        }
        String str24 = self.secondaryLocales;
        if (str24 != null) {
            output.encodeNullableSerializableElement(serialDesc, 30, StringSerializer.INSTANCE, str24);
        }
        String str25 = self.timezone;
        if (str25 != null) {
            output.encodeNullableSerializableElement(serialDesc, 31, StringSerializer.INSTANCE, str25);
        }
        String str26 = self.status;
        if (str26 != null) {
            output.encodeNullableSerializableElement(serialDesc, 32, StringSerializer.INSTANCE, str26);
        }
        String str27 = self.access;
        if (str27 != null) {
            output.encodeNullableSerializableElement(serialDesc, 33, StringSerializer.INSTANCE, str27);
        }
        String str28 = self.url;
        if (str28 != null) {
            output.encodeNullableSerializableElement(serialDesc, 34, StringSerializer.INSTANCE, str28);
        }
        String str29 = self.outcome;
        if (str29 != null) {
            output.encodeNullableSerializableElement(serialDesc, 35, StringSerializer.INSTANCE, str29);
        }
        String str30 = self.reason;
        if (str30 != null) {
            output.encodeNullableSerializableElement(serialDesc, 36, StringSerializer.INSTANCE, str30);
        }
        String str31 = self.settingName;
        if (str31 != null) {
            output.encodeNullableSerializableElement(serialDesc, 37, StringSerializer.INSTANCE, str31);
        }
        Boolean bool2 = self.enabled;
        if (bool2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 38, BooleanSerializer.INSTANCE, bool2);
        }
        String str32 = self.renderFailureCategory;
        if (str32 != null) {
            output.encodeNullableSerializableElement(serialDesc, 39, StringSerializer.INSTANCE, str32);
        }
        String str33 = self.addFragmentState;
        if (str33 != null) {
            output.encodeNullableSerializableElement(serialDesc, 40, StringSerializer.INSTANCE, str33);
        }
        String str34 = self.interactionModelState;
        if (str34 != null) {
            output.encodeNullableSerializableElement(serialDesc, 41, StringSerializer.INSTANCE, str34);
        }
        String str35 = self.interactionSource;
        if (str35 != null) {
            output.encodeNullableSerializableElement(serialDesc, 42, StringSerializer.INSTANCE, str35);
        }
        String str36 = self.dialogStatus;
        if (str36 != null) {
            output.encodeNullableSerializableElement(serialDesc, 43, StringSerializer.INSTANCE, str36);
        }
        Boolean bool3 = self.nddIsEnabled;
        if (bool3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 44, BooleanSerializer.INSTANCE, bool3);
        }
        String str37 = self.failureCategory;
        if (str37 != null) {
            output.encodeNullableSerializableElement(serialDesc, 45, StringSerializer.INSTANCE, str37);
        }
        String str38 = self.errorCode;
        if (str38 != null) {
            output.encodeNullableSerializableElement(serialDesc, 46, StringSerializer.INSTANCE, str38);
        }
        String str39 = self.oldDialogRequestId;
        if (str39 != null) {
            output.encodeNullableSerializableElement(serialDesc, 47, StringSerializer.INSTANCE, str39);
        }
        Long l6 = self.upstreamClientUpl;
        if (l6 != null) {
            output.encodeNullableSerializableElement(serialDesc, 48, LongSerializer.INSTANCE, l6);
        }
        Long l7 = self.downstreamClientUpl;
        if (l7 != null) {
            output.encodeNullableSerializableElement(serialDesc, 49, LongSerializer.INSTANCE, l7);
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getAvsEndpoint() {
        return this.avsEndpoint;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getAppState() {
        return this.appState;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getEventSource() {
        return this.eventSource;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getRevision() {
        return this.revision;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Long getFileCount() {
        return this.fileCount;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Long getNodeCount() {
        return this.nodeCount;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Long getRetryFileCount() {
        return this.retryFileCount;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Long getPollCycleCount() {
        return this.pollCycleCount;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getMuteActive() {
        return this.muteActive;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final String getWakeword() {
        return this.wakeword;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getInvocationNamespace() {
        return this.invocationNamespace;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final String getSecondaryLocales() {
        return this.secondaryLocales;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final String getAccess() {
        return this.access;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final String getSettingName() {
        return this.settingName;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getInvocationIdentifier() {
        return this.invocationIdentifier;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final String getRenderFailureCategory() {
        return this.renderFailureCategory;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final String getAddFragmentState() {
        return this.addFragmentState;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final String getInteractionModelState() {
        return this.interactionModelState;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final String getInteractionSource() {
        return this.interactionSource;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final String getDialogStatus() {
        return this.dialogStatus;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Boolean getNddIsEnabled() {
        return this.nddIsEnabled;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final String getFailureCategory() {
        return this.failureCategory;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component48, reason: from getter */
    public final String getOldDialogRequestId() {
        return this.oldDialogRequestId;
    }

    @Nullable
    /* renamed from: component49, reason: from getter */
    public final Long getUpstreamClientUpl() {
        return this.upstreamClientUpl;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final Long getDownstreamClientUpl() {
        return this.downstreamClientUpl;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getInitiator() {
        return this.initiator;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getResponseType() {
        return this.responseType;
    }

    @NotNull
    public final MetricDimensions copy(@Nullable String dialogRequestId, @Nullable String conversationId, @Nullable String invocationNamespace, @Nullable String invocationIdentifier, @Nullable String invocationType, @Nullable String initiator, @Nullable String interactionLabel, @Nullable String action, @Nullable String responseType, @Nullable String avsEndpoint, @Nullable String fileExtension, @Nullable Long fileSize, @Nullable String appState, @Nullable String eventSource, @Nullable String uri, @Nullable Integer revision, @Nullable Boolean pendingUpdate, @Nullable String messageId, @Nullable String mode, @Nullable Long fileCount, @Nullable Long nodeCount, @Nullable Long retryFileCount, @Nullable String failureReason, @Nullable String resultCode, @Nullable Long pollCycleCount, @Nullable String muteActive, @Nullable String wakeword, @Nullable String version, @Nullable String locale, @Nullable String schema, @Nullable String secondaryLocales, @Nullable String timezone, @Nullable String status, @Nullable String access, @Nullable String url, @Nullable String outcome, @Nullable String reason, @Nullable String settingName, @Nullable Boolean enabled, @Nullable String renderFailureCategory, @Nullable String addFragmentState, @Nullable String interactionModelState, @Nullable String interactionSource, @Nullable String dialogStatus, @Nullable Boolean nddIsEnabled, @Nullable String failureCategory, @Nullable String errorCode, @Nullable String oldDialogRequestId, @Nullable Long upstreamClientUpl, @Nullable Long downstreamClientUpl) {
        return new MetricDimensions(dialogRequestId, conversationId, invocationNamespace, invocationIdentifier, invocationType, initiator, interactionLabel, action, responseType, avsEndpoint, fileExtension, fileSize, appState, eventSource, uri, revision, pendingUpdate, messageId, mode, fileCount, nodeCount, retryFileCount, failureReason, resultCode, pollCycleCount, muteActive, wakeword, version, locale, schema, secondaryLocales, timezone, status, access, url, outcome, reason, settingName, enabled, renderFailureCategory, addFragmentState, interactionModelState, interactionSource, dialogStatus, nddIsEnabled, failureCategory, errorCode, oldDialogRequestId, upstreamClientUpl, downstreamClientUpl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricDimensions)) {
            return false;
        }
        MetricDimensions metricDimensions = (MetricDimensions) other;
        return Intrinsics.areEqual(this.dialogRequestId, metricDimensions.dialogRequestId) && Intrinsics.areEqual(this.conversationId, metricDimensions.conversationId) && Intrinsics.areEqual(this.invocationNamespace, metricDimensions.invocationNamespace) && Intrinsics.areEqual(this.invocationIdentifier, metricDimensions.invocationIdentifier) && Intrinsics.areEqual(this.invocationType, metricDimensions.invocationType) && Intrinsics.areEqual(this.initiator, metricDimensions.initiator) && Intrinsics.areEqual(this.interactionLabel, metricDimensions.interactionLabel) && Intrinsics.areEqual(this.action, metricDimensions.action) && Intrinsics.areEqual(this.responseType, metricDimensions.responseType) && Intrinsics.areEqual(this.avsEndpoint, metricDimensions.avsEndpoint) && Intrinsics.areEqual(this.fileExtension, metricDimensions.fileExtension) && Intrinsics.areEqual(this.fileSize, metricDimensions.fileSize) && Intrinsics.areEqual(this.appState, metricDimensions.appState) && Intrinsics.areEqual(this.eventSource, metricDimensions.eventSource) && Intrinsics.areEqual(this.uri, metricDimensions.uri) && Intrinsics.areEqual(this.revision, metricDimensions.revision) && Intrinsics.areEqual(this.pendingUpdate, metricDimensions.pendingUpdate) && Intrinsics.areEqual(this.messageId, metricDimensions.messageId) && Intrinsics.areEqual(this.mode, metricDimensions.mode) && Intrinsics.areEqual(this.fileCount, metricDimensions.fileCount) && Intrinsics.areEqual(this.nodeCount, metricDimensions.nodeCount) && Intrinsics.areEqual(this.retryFileCount, metricDimensions.retryFileCount) && Intrinsics.areEqual(this.failureReason, metricDimensions.failureReason) && Intrinsics.areEqual(this.resultCode, metricDimensions.resultCode) && Intrinsics.areEqual(this.pollCycleCount, metricDimensions.pollCycleCount) && Intrinsics.areEqual(this.muteActive, metricDimensions.muteActive) && Intrinsics.areEqual(this.wakeword, metricDimensions.wakeword) && Intrinsics.areEqual(this.version, metricDimensions.version) && Intrinsics.areEqual(this.locale, metricDimensions.locale) && Intrinsics.areEqual(this.schema, metricDimensions.schema) && Intrinsics.areEqual(this.secondaryLocales, metricDimensions.secondaryLocales) && Intrinsics.areEqual(this.timezone, metricDimensions.timezone) && Intrinsics.areEqual(this.status, metricDimensions.status) && Intrinsics.areEqual(this.access, metricDimensions.access) && Intrinsics.areEqual(this.url, metricDimensions.url) && Intrinsics.areEqual(this.outcome, metricDimensions.outcome) && Intrinsics.areEqual(this.reason, metricDimensions.reason) && Intrinsics.areEqual(this.settingName, metricDimensions.settingName) && Intrinsics.areEqual(this.enabled, metricDimensions.enabled) && Intrinsics.areEqual(this.renderFailureCategory, metricDimensions.renderFailureCategory) && Intrinsics.areEqual(this.addFragmentState, metricDimensions.addFragmentState) && Intrinsics.areEqual(this.interactionModelState, metricDimensions.interactionModelState) && Intrinsics.areEqual(this.interactionSource, metricDimensions.interactionSource) && Intrinsics.areEqual(this.dialogStatus, metricDimensions.dialogStatus) && Intrinsics.areEqual(this.nddIsEnabled, metricDimensions.nddIsEnabled) && Intrinsics.areEqual(this.failureCategory, metricDimensions.failureCategory) && Intrinsics.areEqual(this.errorCode, metricDimensions.errorCode) && Intrinsics.areEqual(this.oldDialogRequestId, metricDimensions.oldDialogRequestId) && Intrinsics.areEqual(this.upstreamClientUpl, metricDimensions.upstreamClientUpl) && Intrinsics.areEqual(this.downstreamClientUpl, metricDimensions.downstreamClientUpl);
    }

    @Nullable
    public final String getAccess() {
        return this.access;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getAddFragmentState() {
        return this.addFragmentState;
    }

    @Nullable
    public final String getAppState() {
        return this.appState;
    }

    @Nullable
    public final String getAvsEndpoint() {
        return this.avsEndpoint;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getDialogStatus() {
        return this.dialogStatus;
    }

    @Nullable
    public final Long getDownstreamClientUpl() {
        return this.downstreamClientUpl;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getEventSource() {
        return this.eventSource;
    }

    @Nullable
    public final String getFailureCategory() {
        return this.failureCategory;
    }

    @Nullable
    public final String getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    public final Long getFileCount() {
        return this.fileCount;
    }

    @Nullable
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final String getInitiator() {
        return this.initiator;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    public final String getInteractionModelState() {
        return this.interactionModelState;
    }

    @Nullable
    public final String getInteractionSource() {
        return this.interactionSource;
    }

    @Nullable
    public final String getInvocationIdentifier() {
        return this.invocationIdentifier;
    }

    @Nullable
    public final String getInvocationNamespace() {
        return this.invocationNamespace;
    }

    @Nullable
    public final String getInvocationType() {
        return this.invocationType;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final String getMuteActive() {
        return this.muteActive;
    }

    @Nullable
    public final Boolean getNddIsEnabled() {
        return this.nddIsEnabled;
    }

    @Nullable
    public final Long getNodeCount() {
        return this.nodeCount;
    }

    @Nullable
    public final String getOldDialogRequestId() {
        return this.oldDialogRequestId;
    }

    @Nullable
    public final String getOutcome() {
        return this.outcome;
    }

    @Nullable
    public final Boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    @Nullable
    public final Long getPollCycleCount() {
        return this.pollCycleCount;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getRenderFailureCategory() {
        return this.renderFailureCategory;
    }

    @Nullable
    public final String getResponseType() {
        return this.responseType;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final Long getRetryFileCount() {
        return this.retryFileCount;
    }

    @Nullable
    public final Integer getRevision() {
        return this.revision;
    }

    @Nullable
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    public final String getSecondaryLocales() {
        return this.secondaryLocales;
    }

    @Nullable
    public final String getSettingName() {
        return this.settingName;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final Long getUpstreamClientUpl() {
        return this.upstreamClientUpl;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final String getWakeword() {
        return this.wakeword;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invocationNamespace;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.invocationIdentifier;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.invocationType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.initiator;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.interactionLabel;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.action;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.responseType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.avsEndpoint;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.fileExtension;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.fileSize;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        String str12 = this.appState;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.eventSource;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.uri;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.revision;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.pendingUpdate;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.messageId;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.mode;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l2 = this.fileCount;
        int hashCode20 = (hashCode19 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nodeCount;
        int hashCode21 = (hashCode20 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.retryFileCount;
        int hashCode22 = (hashCode21 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str17 = this.failureReason;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.resultCode;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l5 = this.pollCycleCount;
        int hashCode25 = (hashCode24 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str19 = this.muteActive;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.wakeword;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.version;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.locale;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.schema;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.secondaryLocales;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.timezone;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.status;
        int hashCode33 = (hashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.access;
        int hashCode34 = (hashCode33 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.url;
        int hashCode35 = (hashCode34 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.outcome;
        int hashCode36 = (hashCode35 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.reason;
        int hashCode37 = (hashCode36 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.settingName;
        int hashCode38 = (hashCode37 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        int hashCode39 = (hashCode38 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str32 = this.renderFailureCategory;
        int hashCode40 = (hashCode39 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.addFragmentState;
        int hashCode41 = (hashCode40 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.interactionModelState;
        int hashCode42 = (hashCode41 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.interactionSource;
        int hashCode43 = (hashCode42 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.dialogStatus;
        int hashCode44 = (hashCode43 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Boolean bool3 = this.nddIsEnabled;
        int hashCode45 = (hashCode44 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str37 = this.failureCategory;
        int hashCode46 = (hashCode45 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.errorCode;
        int hashCode47 = (hashCode46 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.oldDialogRequestId;
        int hashCode48 = (hashCode47 + (str39 == null ? 0 : str39.hashCode())) * 31;
        Long l6 = this.upstreamClientUpl;
        int hashCode49 = (hashCode48 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.downstreamClientUpl;
        return hashCode49 + (l7 != null ? l7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = this.dialogRequestId != null ? "***" : "null";
        String str3 = this.conversationId != null ? "***" : "null";
        String str4 = this.invocationNamespace;
        String str5 = this.invocationIdentifier;
        String str6 = this.invocationType;
        String str7 = this.initiator;
        String str8 = this.interactionLabel;
        String str9 = this.action;
        String str10 = this.responseType;
        String str11 = this.renderFailureCategory;
        String str12 = this.addFragmentState;
        String str13 = this.interactionModelState;
        String str14 = this.interactionSource;
        str = "null";
        String str15 = this.dialogStatus;
        Boolean bool = this.nddIsEnabled;
        String str16 = this.avsEndpoint;
        String str17 = this.fileExtension;
        Long l = this.fileSize;
        String str18 = this.appState;
        String str19 = this.eventSource;
        String str20 = this.uri;
        Integer num = this.revision;
        Boolean bool2 = this.pendingUpdate;
        String str21 = this.messageId != null ? "***" : str;
        String str22 = this.mode;
        Long l2 = this.fileCount;
        Long l3 = this.nodeCount;
        Long l4 = this.retryFileCount;
        String str23 = this.failureReason;
        String str24 = this.resultCode;
        Long l5 = this.pollCycleCount;
        String str25 = this.muteActive;
        String str26 = this.wakeword;
        String str27 = this.version;
        String str28 = this.locale;
        String str29 = this.schema;
        String str30 = this.secondaryLocales;
        String str31 = this.timezone;
        String str32 = this.status;
        String str33 = this.access;
        String str34 = this.url != null ? "***" : str;
        String str35 = this.outcome;
        String str36 = this.reason;
        String str37 = this.settingName;
        Boolean bool3 = this.enabled;
        String str38 = this.failureCategory;
        String str39 = this.errorCode;
        str = this.oldDialogRequestId != null ? "***" : "null";
        Long l6 = this.upstreamClientUpl;
        Long l7 = this.downstreamClientUpl;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("MetricDimensions(dialogRequestId=", str2, ", conversationId=", str3, ", invocationNamespace=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str4, ", invocationIdentifier=", str5, ", invocationType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str6, ", initiator=", str7, ", interactionLabel=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str8, ", action=", str9, ", responseType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str10, ", renderFailureCategory=", str11, ", addFragmentState=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str12, ", interactionModelState=", str13, ", interactionSource=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str14, ", dialogStatus=", str15, ", nddIsEnabled=");
        m.append(bool);
        m.append(", avsEndpoint=");
        m.append(str16);
        m.append(", fileExtension=");
        m.append(str17);
        m.append(", fileSize=");
        m.append(l);
        m.append(", appState=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str18, ", eventSource=", str19, ", uri=");
        m.append(str20);
        m.append(", revision=");
        m.append(num);
        m.append(", pendingUpdate=");
        m.append(bool2);
        m.append(", messageId=");
        m.append(str21);
        m.append(", mode=");
        m.append(str22);
        m.append(", fileCount=");
        m.append(l2);
        m.append(", nodeCount=");
        m.append(l3);
        m.append(", retryFileCount=");
        m.append(l4);
        m.append(", failureReason=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str23, ", resultCode=", str24, ", pollCycleCount=");
        m.append(l5);
        m.append(", muteActive=");
        m.append(str25);
        m.append(", wakeword=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str26, ", version=", str27, ", locale=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str28, ", schema=", str29, ", secondaryLocales=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str30, ", timezone=", str31, ", status=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str32, ", access=", str33, ", url=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str34, ", outcome=", str35, ", reason=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str36, ", settingName=", str37, ", enabled=");
        m.append(bool3);
        m.append(", failureCategory=");
        m.append(str38);
        m.append(", errorCode=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str39, ", oldDialogRequestId=", str, ", upstreamClientUpl=");
        m.append(l6);
        m.append(", downstreamClientUpl=");
        m.append(l7);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public /* synthetic */ MetricDimensions(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, String str12, String str13, String str14, Integer num, Boolean bool, String str15, String str16, Long l2, Long l3, Long l4, String str17, String str18, Long l5, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, Boolean bool2, String str32, String str33, String str34, String str35, String str36, Boolean bool3, String str37, String str38, String str39, Long l6, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dialogRequestId = null;
        } else {
            this.dialogRequestId = str;
        }
        if ((i & 2) == 0) {
            this.conversationId = null;
        } else {
            this.conversationId = str2;
        }
        if ((i & 4) == 0) {
            this.invocationNamespace = null;
        } else {
            this.invocationNamespace = str3;
        }
        if ((i & 8) == 0) {
            this.invocationIdentifier = null;
        } else {
            this.invocationIdentifier = str4;
        }
        if ((i & 16) == 0) {
            this.invocationType = null;
        } else {
            this.invocationType = str5;
        }
        if ((i & 32) == 0) {
            this.initiator = null;
        } else {
            this.initiator = str6;
        }
        if ((i & 64) == 0) {
            this.interactionLabel = null;
        } else {
            this.interactionLabel = str7;
        }
        if ((i & 128) == 0) {
            this.action = null;
        } else {
            this.action = str8;
        }
        if ((i & 256) == 0) {
            this.responseType = null;
        } else {
            this.responseType = str9;
        }
        if ((i & 512) == 0) {
            this.avsEndpoint = null;
        } else {
            this.avsEndpoint = str10;
        }
        if ((i & 1024) == 0) {
            this.fileExtension = null;
        } else {
            this.fileExtension = str11;
        }
        if ((i & 2048) == 0) {
            this.fileSize = null;
        } else {
            this.fileSize = l;
        }
        if ((i & 4096) == 0) {
            this.appState = null;
        } else {
            this.appState = str12;
        }
        if ((i & 8192) == 0) {
            this.eventSource = null;
        } else {
            this.eventSource = str13;
        }
        if ((i & 16384) == 0) {
            this.uri = null;
        } else {
            this.uri = str14;
        }
        if ((i & 32768) == 0) {
            this.revision = null;
        } else {
            this.revision = num;
        }
        if ((i & 65536) == 0) {
            this.pendingUpdate = null;
        } else {
            this.pendingUpdate = bool;
        }
        if ((i & 131072) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str15;
        }
        if ((262144 & i) == 0) {
            this.mode = null;
        } else {
            this.mode = str16;
        }
        if ((524288 & i) == 0) {
            this.fileCount = null;
        } else {
            this.fileCount = l2;
        }
        if ((1048576 & i) == 0) {
            this.nodeCount = null;
        } else {
            this.nodeCount = l3;
        }
        if ((2097152 & i) == 0) {
            this.retryFileCount = null;
        } else {
            this.retryFileCount = l4;
        }
        if ((4194304 & i) == 0) {
            this.failureReason = null;
        } else {
            this.failureReason = str17;
        }
        if ((8388608 & i) == 0) {
            this.resultCode = null;
        } else {
            this.resultCode = str18;
        }
        if ((16777216 & i) == 0) {
            this.pollCycleCount = null;
        } else {
            this.pollCycleCount = l5;
        }
        if ((33554432 & i) == 0) {
            this.muteActive = null;
        } else {
            this.muteActive = str19;
        }
        if ((67108864 & i) == 0) {
            this.wakeword = null;
        } else {
            this.wakeword = str20;
        }
        if ((134217728 & i) == 0) {
            this.version = null;
        } else {
            this.version = str21;
        }
        if ((268435456 & i) == 0) {
            this.locale = null;
        } else {
            this.locale = str22;
        }
        if ((536870912 & i) == 0) {
            this.schema = null;
        } else {
            this.schema = str23;
        }
        if ((1073741824 & i) == 0) {
            this.secondaryLocales = null;
        } else {
            this.secondaryLocales = str24;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str25;
        }
        if ((i2 & 1) == 0) {
            this.status = null;
        } else {
            this.status = str26;
        }
        if ((i2 & 2) == 0) {
            this.access = null;
        } else {
            this.access = str27;
        }
        if ((i2 & 4) == 0) {
            this.url = null;
        } else {
            this.url = str28;
        }
        if ((i2 & 8) == 0) {
            this.outcome = null;
        } else {
            this.outcome = str29;
        }
        if ((i2 & 16) == 0) {
            this.reason = null;
        } else {
            this.reason = str30;
        }
        if ((i2 & 32) == 0) {
            this.settingName = null;
        } else {
            this.settingName = str31;
        }
        if ((i2 & 64) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool2;
        }
        if ((i2 & 128) == 0) {
            this.renderFailureCategory = null;
        } else {
            this.renderFailureCategory = str32;
        }
        if ((i2 & 256) == 0) {
            this.addFragmentState = null;
        } else {
            this.addFragmentState = str33;
        }
        if ((i2 & 512) == 0) {
            this.interactionModelState = null;
        } else {
            this.interactionModelState = str34;
        }
        if ((i2 & 1024) == 0) {
            this.interactionSource = null;
        } else {
            this.interactionSource = str35;
        }
        if ((i2 & 2048) == 0) {
            this.dialogStatus = null;
        } else {
            this.dialogStatus = str36;
        }
        if ((i2 & 4096) == 0) {
            this.nddIsEnabled = null;
        } else {
            this.nddIsEnabled = bool3;
        }
        if ((i2 & 8192) == 0) {
            this.failureCategory = null;
        } else {
            this.failureCategory = str37;
        }
        if ((i2 & 16384) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = str38;
        }
        if ((i2 & 32768) == 0) {
            this.oldDialogRequestId = null;
        } else {
            this.oldDialogRequestId = str39;
        }
        if ((i2 & 65536) == 0) {
            this.upstreamClientUpl = null;
        } else {
            this.upstreamClientUpl = l6;
        }
        if ((i2 & 131072) == 0) {
            this.downstreamClientUpl = null;
        } else {
            this.downstreamClientUpl = l7;
        }
    }

    public MetricDimensions(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Long l, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str15, @Nullable String str16, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable String str17, @Nullable String str18, @Nullable Long l5, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable Boolean bool2, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable Boolean bool3, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable Long l6, @Nullable Long l7) {
        this.dialogRequestId = str;
        this.conversationId = str2;
        this.invocationNamespace = str3;
        this.invocationIdentifier = str4;
        this.invocationType = str5;
        this.initiator = str6;
        this.interactionLabel = str7;
        this.action = str8;
        this.responseType = str9;
        this.avsEndpoint = str10;
        this.fileExtension = str11;
        this.fileSize = l;
        this.appState = str12;
        this.eventSource = str13;
        this.uri = str14;
        this.revision = num;
        this.pendingUpdate = bool;
        this.messageId = str15;
        this.mode = str16;
        this.fileCount = l2;
        this.nodeCount = l3;
        this.retryFileCount = l4;
        this.failureReason = str17;
        this.resultCode = str18;
        this.pollCycleCount = l5;
        this.muteActive = str19;
        this.wakeword = str20;
        this.version = str21;
        this.locale = str22;
        this.schema = str23;
        this.secondaryLocales = str24;
        this.timezone = str25;
        this.status = str26;
        this.access = str27;
        this.url = str28;
        this.outcome = str29;
        this.reason = str30;
        this.settingName = str31;
        this.enabled = bool2;
        this.renderFailureCategory = str32;
        this.addFragmentState = str33;
        this.interactionModelState = str34;
        this.interactionSource = str35;
        this.dialogStatus = str36;
        this.nddIsEnabled = bool3;
        this.failureCategory = str37;
        this.errorCode = str38;
        this.oldDialogRequestId = str39;
        this.upstreamClientUpl = l6;
        this.downstreamClientUpl = l7;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<MetricDimensions> serializer() {
            return MetricDimensions$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getAccess$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getAction$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getAddFragmentState$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getAppState$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getAvsEndpoint$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getConversationId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getDialogRequestId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getDialogStatus$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getDownstreamClientUpl$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getEventSource$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getFailureCategory$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getFailureReason$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getFileCount$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getFileExtension$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getFileSize$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInitiator$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInteractionLabel$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInteractionModelState$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInteractionSource$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInvocationIdentifier$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInvocationNamespace$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getInvocationType$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getLocale$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getMode$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getMuteActive$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getNddIsEnabled$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getNodeCount$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getOldDialogRequestId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getOutcome$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getPendingUpdate$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getPollCycleCount$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getReason$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getRenderFailureCategory$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getResponseType$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getResultCode$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getRetryFileCount$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getRevision$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getSchema$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getSecondaryLocales$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getSettingName$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getTimezone$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getUpstreamClientUpl$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getUri$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getUrl$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getVersion$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getWakeword$annotations() {
    }

    public MetricDimensions() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, -1, 262143, (DefaultConstructorMarker) null);
    }
}
