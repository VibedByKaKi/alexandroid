package com.amazon.comms.calling.foundation.metrics;

import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bI\n\u0002\u0010\t\n\u0002\b~\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010 \u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010¡\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¢\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010£\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¤\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¥\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¦\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010§\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¨\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010©\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010ª\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010«\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¬\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010®\u0001\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000f\u0010¯\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010°\u0001\u001a\u00020\u0005¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R\u0014\u0010³\u0001\u001a\u00020\u0005¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010²\u0001R\u0014\u0010µ\u0001\u001a\u00020\u0005¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010²\u0001R\u000f\u0010·\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¸\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¹\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010º\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010»\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¼\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010½\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¾\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010¿\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010À\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Á\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Â\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ã\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ä\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Å\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Æ\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ç\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010È\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010É\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ê\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ë\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010Ì\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006Í\u0001"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/MetricKeys;", "", "<init>", "()V", "C", "", "CA", "CCALL", "CAPI", "SUCCESS_SFX", "FAILURE_SFX", "FAULT_SFX", "LATENCY_SFX", "DROP_SFX", "UNKNOWN_SFX", "OK_SFX", "CANCEL_SFX", "OPEN_SFX", "RETRY_SFX", "NETWORK_SFX", "GRANT_SFX", "REVOKE_SFX", "ERROR_SFX", "SHOW_SFX", "CALL_PAYLOAD_COMMUNAL", "CALL_ABORT_RETRY", "GET_IDENTITY", "CPCC", "CPCC_CALLING", "CPCC_CALLING_DIAL", "CPCC_CALLING_ACCEPT", "CPCC_CALLING_END", "CPCC_CALLING_UNSUPPORTED", "CPCC_CALLING_COBO_INSTEAD_OF_PCC", "CPCC_CALLING_DIAL_DRIVE_MODE", "DIRECTIVE", "PCC", "PCC_DIAL_DIRECTIVE", "PCC_ACCEPT_DIRECTIVE", "PCC_STOP_DIRECTIVE", "VALUE_NO_PERMISSIONS", "VALUE_AT_COMMAND_FAILURE", "VALUE_JSON_EXCEPTION", "ACCESSORY", "AMPD", LegacyFlags.DEFAULT_FRIENDLY_NAME_TEMPLATE, "CALL_INCOMING_RECEIVED", "CALL_ANSWER", "CALL_BUSY", "CALL_CONNECTED", "CALL_CONNECTED_VIDEO", "CALL_CONNECTED_AUDIO", "CALL_CONNECTED_VIDEO_INCOMING", "CALL_CONNECTED_VIDEO_OUTGOING", "CALL_CONNECTED_AUDIO_INCOMING", "CALL_CONNECTED_AUDIO_OUTGOING", "CALL_CONNECTED_DROPIN", "CALL_CONNECTED_DROPIN_VIDEO", "CALL_CONNECTED_DROPIN_AUDIO", "CALL_DECLINE", "CALL_DURATION", "CALL_END_CALL", "CALL_OFFLINE", "CALL_RINGING", "CALL_HANGUP", "CALL_HANGUP_END_CALL_USE_CASE", "CALL_TIMEOUT", "INITIATE_CALL", "INITIATE_AUDIO_CALL", "INITIATE_VIDEO_CALL", "INITIATE_CONTACT_DROP_IN", "INITIATE_DROP_IN", "INITIATE_GROUP_CALL", "INITIATE_CHAPMAN_CALL", "INITIATE_CALL_NOT_PROVISIONED", "INITIATE_RESOLVABLE_TARGET_CALL_PREFIX", "CNOTIF", "NOTIFICATION_CALL_RECEIVED", "INVITE_DELAY_IN_MILLIS", "", "NOTIFICATION_CALL_INVITE_LATENCY", "NOTIFICATION_CALL_INVITE_TIMEOUT", "NOTIFICATION_CALL_HEADSUP_FAILURE", "CALL_TIME_TO_RING", "CALL_DROPPED", "CALL_TIME_TO_DROP_IN", "CALL_TIME_TO_ANSWER", "CALL_IN_CALL_LATENCY", "CALL_IN_CALL_LATENCY_INVALID", "CALL_INITIATE_FAIL", "CALL_INITIATE_FAIL_AT_SIP_REGISTRATION", "CALL_INITIATE_FAIL_MAKE_CALL_USECASE", "CALL_INITIATE_FAIL_INITIATE_CALL_USECASE", "CALL_INITIATE_FAIL_NO_HOME_GROUP", "DCAS_UNINIT", "C_SIP", "SIP_AUTH_TOKEN_EXPIRING", "SIP_REG_FAIL", "SIP_REG_FAIL_AS_ANOTHER_REG_IN_PROGRESS", "SIP_SHUTDOWN_FAIL", "SIP_REG_FAIL_AT_AWAITSIP", "CALL_FAIL_NO_SIP", "CALL_FAIL_UNKNOWN", "CALL_FAIL_LOST_CONNECTION", "CALL_FAIL_WITH_ERROR_CODE", "CALL_FAIL_WITH_METRIC_VALUE", "CALL_FAIL_WITH_TIME_LEFT_IN_AUTHTOKEN", "CALL_FAIL_DURING_CALL_WITH_ERROR_CODE", "HALLO", "HALLO_BEGIN_CALL_DIRECTIVE", "HALLO_ACCEPT_CALL_DIRECTIVE", "HALLO_END_CALL_DIRECTIVE", "HALLO_MEDIA_STATE_CHANGE_DIRECTIVE", "OP_CREATE_AUTH_TOKEN", "FAIL_NULL_RESPONSE", "FAIL_EMPTY_TOKEN", "FAIL_NULL_TOKEN", "FAIL_INVALID_EXPIRATION", "FAIL_TOKEN_ALREADY_EXPIRED", "OP_INITIATE_OUTBOUND_CALL", "OP_CREATE_CALL_ENDPOINTS", "OP_GET_MPU_ENABLED", "OP_GET_RECENT_COMMUNICATIONS", "OP_GET_DEVICE", "OP_BIZ_CAPTURE_CALL_QUALITY", "OP_BIZ_CAPTURE_CALLING", "OP_GET_IDENTITY_V2", "OP_GET_IDENTITY_PREFERENCES", "OP_UPDATE_IDENTITY_PREFERENCES", "OP_GET_OR_CREATE_CONTACT", "TELECOM", "MULTI_ACTION_BUTTON", "MULTI_ACTION_BUTTON_ANSWER", "MULTI_ACTION_BUTTON_DISCONNECT_OR_CONCURRENT_CALL", "REJECTING_ALEXA_AFTER_INCOMING_CONCURRENT_CALLS", "MULTI_ACTION_BUTTON_ABORT", "CONNECTION_AUDIO_CHANGE", "REGISTER_PHONE_ACCOUNT", "REGISTER_PHONE_ACCOUNT_FAIL", "DEREGISTER_PHONE_ACCOUNT", "TELECOM_EMPTY_CALLER_NAME", "TELECOM_EMPTY_CALLID", "TELECOM_EMPTY_COMMS_ID", "KIDS_INBOUND_CALLING", "KIDS_INBOUND_CALLING_BLOCKED", "KIDS_INBOUND_CALLING_ERROR", "HOMEGROUP", "EMPTY_HOMEGROUP_ID", "NO_HOMEGROUP_ID", "PLACE_CALL", "ADD_NEW_INCOMING_CALL", "PLACE_CALL_CALLBACK", "ADD_NEW_INCOMING_CALL_CALLBACK", "PLACE_CALL_FAIL", "ADD_NEW_INCOMING_CALL_FAIL", "ACTIVATE_CONNECTION", "PLACE_CALL_PERMISSION_CRASH", "AUDIO_PICKER", "AUDIO_PICKER_SHOWN", "ROUTE_SELECTED", "CALERT", "ALERT_PERM_MIC", "ALERT_PERM_MIC_AND_CAMERA", "MPU_CALL", "MPU_CALL_VIDEO", "CPERMS", "MPU", "OPTIN_SHOWN", "LEARN_MORE_TAPPED", "ENABLE_TAPPED", "LATER_TAPPED", "ENABLE_TAPPED_AFTER_LEARN_MORE", "LATER_TAPPED_AFTER_LEARN_MORE", "OP_GET_MPU_ENABLED_IOEXCEPTION", "CSCREEN", "SCREEN_CALL_ACTIVE", "SCREEN_CALL_ACTIVE_RESUMED", "getSCREEN_CALL_ACTIVE_RESUMED", "()Ljava/lang/String;", "SCREEN_CALL_ACTIVE_HOME_PRESSED", "getSCREEN_CALL_ACTIVE_HOME_PRESSED", "SCREEN_CALL_ACTIVE_BACK_PRESSED", "getSCREEN_CALL_ACTIVE_BACK_PRESSED", "CALL_RECONNECT_FAILURE", "REMOTE_PARTICIPANT_NAME_EMPTY_FAIL", "REMOTE_PARTICIPANT_NAME_EMPTY_CALL_SCREEN_FAIL", "NOTIFICATION_CALL_QUERY_NAME_FAIL", "INCOMING_SIP_SERVICE_EXCEPTION", "DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_SHOW", "DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_HIDE", "DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_DURATION", "CALL_MUTED_VIA_ACCESSORY_DURING_CALL", "MAKE_CALL_WITH_ACCESSORY_CONNECTED", "GSON_PARSE_DATE_FAIL", "SIP_INITIALIZATION_AWAIT_FAIL", "EFFECT_THUMBNAIL_FAIL", "REACTION_THUMBNAIL_FAIL", "APP_FOREGROUND_SIP_REGISTERED", "SKYPE_REDIRECT_TO_MARKET_COUNT", "SKYPE_REDIRECT_TO_MARKET_FAILED", "SKYPE_APP_ACTION", "SKYPE_APP_ACTION_FAILED", "START_FOREGROUND", "START_FOREGROUND_ONGOING_CALL_NOTIFICATION_FAIL", "START_FOREGROUND_INCOMING_CALL_NOTIFICATION_FAIL", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class MetricKeys {

    @NotNull
    public static final String ACCESSORY = ".accessory";

    @NotNull
    public static final String ACTIVATE_CONNECTION = "comms.telecom.con.activate";

    @NotNull
    public static final String ADD_NEW_INCOMING_CALL = "comms.telecom.addIncomingCall";

    @NotNull
    public static final String ADD_NEW_INCOMING_CALL_CALLBACK = "comms.telecom.addIncomingCall.callback";

    @NotNull
    public static final String ADD_NEW_INCOMING_CALL_FAIL = "comms.telecom.addIncomingCall.fail";

    @NotNull
    public static final String ALERT_PERM_MIC = "comms.alert.perms.mic.open";

    @NotNull
    public static final String ALERT_PERM_MIC_AND_CAMERA = "comms.alert.perms.mic.and.camera.open";

    @NotNull
    public static final String AMPD = ".ampd";

    @NotNull
    public static final String APP_FOREGROUND_SIP_REGISTERED = "comms.call.sip.foreground.registered";

    @NotNull
    public static final String AUDIO_PICKER = "comms.telecom.audiopicker";

    @NotNull
    public static final String AUDIO_PICKER_SHOWN = "comms.telecom.audiopicker.shown";

    @NotNull
    private static final String C = "comms";

    @NotNull
    private static final String CA = "comms.app";

    @NotNull
    private static final String CALERT = "comms.alert";

    @NotNull
    public static final String CALL_ABORT_RETRY = "comms.call.beginCall.abortRetry";

    @NotNull
    public static final String CALL_ANSWER = "comms.call.answered";

    @NotNull
    public static final String CALL_BUSY = "comms.call.busy";

    @NotNull
    public static final String CALL_CONNECTED = "comms.call.connected";

    @NotNull
    private static final String CALL_CONNECTED_AUDIO = "comms.call.connected.audio";

    @NotNull
    public static final String CALL_CONNECTED_AUDIO_INCOMING = "comms.call.connected.audio.incoming";

    @NotNull
    public static final String CALL_CONNECTED_AUDIO_OUTGOING = "comms.call.connected.audio.outgoing";

    @NotNull
    public static final String CALL_CONNECTED_DROPIN = "comms.call.connected.dropin";

    @NotNull
    public static final String CALL_CONNECTED_DROPIN_AUDIO = "comms.call.connected.dropin.audio";

    @NotNull
    public static final String CALL_CONNECTED_DROPIN_VIDEO = "comms.call.connected.dropin.video";

    @NotNull
    private static final String CALL_CONNECTED_VIDEO = "comms.call.connected.video";

    @NotNull
    public static final String CALL_CONNECTED_VIDEO_INCOMING = "comms.call.connected.video.incoming";

    @NotNull
    public static final String CALL_CONNECTED_VIDEO_OUTGOING = "comms.call.connected.video.outgoing";

    @NotNull
    public static final String CALL_DECLINE = "comms.call.declined";

    @NotNull
    public static final String CALL_DROPPED = "comms.call.drop";

    @NotNull
    public static final String CALL_DURATION = "comms.call.duration";

    @NotNull
    public static final String CALL_END_CALL = "comms.call.aborted";

    @NotNull
    public static final String CALL_FAIL_DURING_CALL_WITH_ERROR_CODE = "comms.call.failed.%s";

    @NotNull
    public static final String CALL_FAIL_LOST_CONNECTION = "comms.call.failed.lostConnection";

    @NotNull
    public static final String CALL_FAIL_NO_SIP = "comms.call.failed.notConnectedToSIP";

    @NotNull
    public static final String CALL_FAIL_UNKNOWN = "comms.call.failed.unknownReason";

    @NotNull
    public static final String CALL_FAIL_WITH_ERROR_CODE = "comms.call.failed.errorCode.%s";

    @NotNull
    public static final String CALL_FAIL_WITH_METRIC_VALUE = "comms.call.failed.errorCodeWithMetricValue.%s";

    @NotNull
    public static final String CALL_FAIL_WITH_TIME_LEFT_IN_AUTHTOKEN = "comms.call.failed.errorCodeWithTimeLeftInAuthToken.%s";

    @NotNull
    public static final String CALL_HANGUP = "comms.call.hangup";

    @NotNull
    public static final String CALL_HANGUP_END_CALL_USE_CASE = "comms.call.hangup.EndCallUseCase";

    @NotNull
    public static final String CALL_INCOMING_RECEIVED = "comms.callincoming.received";

    @NotNull
    public static final String CALL_INITIATE_FAIL = "comms.call.initiate.fail";

    @NotNull
    public static final String CALL_INITIATE_FAIL_AT_SIP_REGISTRATION = "comms.call.initiate.fail.registerSip";

    @NotNull
    public static final String CALL_INITIATE_FAIL_INITIATE_CALL_USECASE = "comms.call.initiate.fail.initiatecallusecase";

    @NotNull
    public static final String CALL_INITIATE_FAIL_MAKE_CALL_USECASE = "comms.call.initiate.fail.makecallusecase";

    @NotNull
    public static final String CALL_INITIATE_FAIL_NO_HOME_GROUP = "comms.call.initiate.fail.noHomeGroup";

    @NotNull
    public static final String CALL_IN_CALL_LATENCY = "comms.call.inCall.latency";

    @NotNull
    public static final String CALL_IN_CALL_LATENCY_INVALID = "comms.call.inCall.latency.invalid";

    @NotNull
    public static final String CALL_MUTED_VIA_ACCESSORY_DURING_CALL = "comms.call.accessory.pressed.muted";

    @NotNull
    public static final String CALL_OFFLINE = "comms.call.offline";

    @NotNull
    public static final String CALL_PAYLOAD_COMMUNAL = "comms.call.beginCall.payloadCommunal";

    @NotNull
    public static final String CALL_RECONNECT_FAILURE = "comms.call.reconnect.fail";

    @NotNull
    public static final String CALL_RINGING = "comms.call.ringing";

    @NotNull
    public static final String CALL_TIMEOUT = "comms.call.timeout";

    @NotNull
    public static final String CALL_TIME_TO_ANSWER = "comms.call.timeToAnswer.latency";

    @NotNull
    public static final String CALL_TIME_TO_DROP_IN = "comms.call.dropInToConnected.latency";

    @NotNull
    public static final String CALL_TIME_TO_RING = "comms.call.timeToRing.latency";

    @NotNull
    public static final String CANCEL_SFX = ".cancel";

    @NotNull
    private static final String CAPI = "comms.api";

    @NotNull
    private static final String CCALL = "comms.call";

    @NotNull
    private static final String CNOTIF = "comms.notif";

    @NotNull
    public static final String CONNECTION_AUDIO_CHANGE = "comms.telecom.audio.change";

    @NotNull
    private static final String CPCC = "comms.pcc";

    @NotNull
    public static final String CPCC_CALLING = "comms.pcc.call";

    @NotNull
    public static final String CPCC_CALLING_ACCEPT = "comms.pcc.call.accept";

    @NotNull
    public static final String CPCC_CALLING_COBO_INSTEAD_OF_PCC = "comms.pcc.call.cobo.instead.of.pcc";

    @NotNull
    public static final String CPCC_CALLING_DIAL = "comms.pcc.call.dial";

    @NotNull
    public static final String CPCC_CALLING_DIAL_DRIVE_MODE = "comms.pcc.call.dialDriveMode";

    @NotNull
    public static final String CPCC_CALLING_END = "comms.pcc.call.stop";

    @NotNull
    public static final String CPCC_CALLING_UNSUPPORTED = "comms.pcc.call.unsupported";

    @NotNull
    public static final String CPERMS = "comms.call.perms";

    @NotNull
    public static final String C_SIP = "comms.sip";

    @NotNull
    public static final String DCAS_UNINIT = "comms.call.dcas.uninit";

    @NotNull
    public static final String DEREGISTER_PHONE_ACCOUNT = "comms.telecom.deregister.phone.account";

    @NotNull
    public static final String DIRECTIVE = "comms.directive";

    @NotNull
    public static final String DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_DURATION = "comms.call.dropIn.frostedGlassDisclaimerDuration";

    @NotNull
    public static final String DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_HIDE = "comms.call.dropIn.frostedGlassDisclaimerHide";

    @NotNull
    public static final String DROPIN_SHOW_FROSTED_GLASS_DISCLAIMER_SHOW = "comms.call.dropIn.frostedGlassDisclaimerShow";

    @NotNull
    public static final String DROP_SFX = ".drop";

    @NotNull
    public static final String EFFECT_THUMBNAIL_FAIL = "comms.call.effect.thumbnail.fail";

    @NotNull
    public static final String EMPTY_HOMEGROUP_ID = "comms.call.homegroupid.empty";

    @NotNull
    public static final String ENABLE_TAPPED = "comms.call.perms.mpu.enable.tapped";

    @NotNull
    public static final String ENABLE_TAPPED_AFTER_LEARN_MORE = "comms.call.perms.mpu.enable.tapped.afterLearnMore";

    @NotNull
    public static final String ERROR_SFX = ".error";

    @NotNull
    public static final String FAILURE_SFX = ".fail";

    @NotNull
    public static final String FAIL_EMPTY_TOKEN = "comms.api.auth.token.create.emptyToken";

    @NotNull
    public static final String FAIL_INVALID_EXPIRATION = "comms.api.auth.token.create.invalidExpiration";

    @NotNull
    public static final String FAIL_NULL_RESPONSE = "comms.api.auth.token.create.nullResponse";

    @NotNull
    public static final String FAIL_NULL_TOKEN = "comms.api.auth.token.create.nullToken";

    @NotNull
    public static final String FAIL_TOKEN_ALREADY_EXPIRED = "comms.api.auth.token.create.alreadyExpiredToken";

    @NotNull
    public static final String FAULT_SFX = ".fault";

    @NotNull
    public static final String GET_IDENTITY = "comms.api.getIdentity";

    @NotNull
    public static final String GRANT_SFX = ".grant";

    @NotNull
    public static final String GSON_PARSE_DATE_FAIL = "comms.call.authToken.parseDate.fail";

    @NotNull
    public static final String HALLO = ".hallo";

    @NotNull
    public static final String HALLO_ACCEPT_CALL_DIRECTIVE = ".hallo.accept";

    @NotNull
    public static final String HALLO_BEGIN_CALL_DIRECTIVE = ".hallo.begin";

    @NotNull
    public static final String HALLO_END_CALL_DIRECTIVE = ".hallo.end";

    @NotNull
    public static final String HALLO_MEDIA_STATE_CHANGE_DIRECTIVE = ".hallo.mediaChange";

    @NotNull
    public static final String HOMEGROUP = "comms.call.homegroupid";

    @NotNull
    public static final String INCOMING_SIP_SERVICE_EXCEPTION = "comms.call.incoming.sip.background.exception";

    @NotNull
    public static final String INITIATE_AUDIO_CALL = "comms.call.initiate.request.audioCall";

    @NotNull
    private static final String INITIATE_CALL = "comms.call.initiate.request";

    @NotNull
    public static final String INITIATE_CALL_NOT_PROVISIONED = "comms.call.initiate.request.notProvisioned";

    @NotNull
    public static final String INITIATE_CHAPMAN_CALL = "comms.call.initiate.request.chapmanCall";

    @NotNull
    public static final String INITIATE_CONTACT_DROP_IN = "comms.call.initiate.request.dropInContact";

    @NotNull
    public static final String INITIATE_DROP_IN = "comms.call.initiate.request.dropIn";

    @NotNull
    public static final String INITIATE_GROUP_CALL = "comms.call.initiate.request.groupCall";

    @NotNull
    public static final String INITIATE_RESOLVABLE_TARGET_CALL_PREFIX = "comms.call.initiate.request.resovlableTargetCall";

    @NotNull
    public static final String INITIATE_VIDEO_CALL = "comms.call.initiate.request.videoCall";
    public static final long INVITE_DELAY_IN_MILLIS = 15000;

    @NotNull
    private static final String KIDS_INBOUND_CALLING = "comms.call.kids.inbound.calling";

    @NotNull
    public static final String KIDS_INBOUND_CALLING_BLOCKED = "comms.call.kids.inbound.calling.blocked";

    @NotNull
    public static final String KIDS_INBOUND_CALLING_ERROR = "comms.call.kids.inbound.calling.error";

    @NotNull
    public static final String LATENCY_SFX = ".latency";

    @NotNull
    public static final String LATER_TAPPED = "comms.call.perms.mpu.later.tapped";

    @NotNull
    public static final String LATER_TAPPED_AFTER_LEARN_MORE = "comms.call.perms.mpu.later.tapped.afterLearnMore";

    @NotNull
    public static final String LEARN_MORE_TAPPED = "comms.call.perms.mpu.learn.tapped";

    @NotNull
    public static final String MAKE_CALL_WITH_ACCESSORY_CONNECTED = "comms.call.makeCall.withAccessory";

    @NotNull
    public static final String MPU = "comms.call.perms.mpu";

    @NotNull
    public static final String MPU_CALL = "comms.call.mpu";

    @NotNull
    public static final String MPU_CALL_VIDEO = "comms.call.mpu.video";

    @NotNull
    private static final String MULTI_ACTION_BUTTON = ".actBtn";

    @NotNull
    public static final String MULTI_ACTION_BUTTON_ABORT = "comms.telecom.actBtn.abort";

    @NotNull
    public static final String MULTI_ACTION_BUTTON_ANSWER = "comms.telecom.actBtn.answer";

    @NotNull
    public static final String MULTI_ACTION_BUTTON_DISCONNECT_OR_CONCURRENT_CALL = "comms.telecom.actBtn.dsc.or.call";

    @NotNull
    public static final String NETWORK_SFX = ".network";

    @NotNull
    public static final String NOTIFICATION_CALL_HEADSUP_FAILURE = "comms.notif.call.incoming.fail";

    @NotNull
    public static final String NOTIFICATION_CALL_INVITE_LATENCY = "comms.notif.call.incoming.invite.latency";

    @NotNull
    public static final String NOTIFICATION_CALL_INVITE_TIMEOUT = "comms.notif.call.incoming.invite.timeout";

    @NotNull
    public static final String NOTIFICATION_CALL_QUERY_NAME_FAIL = "comms.notif.call.incoming.name.query.fail";

    @NotNull
    public static final String NOTIFICATION_CALL_RECEIVED = "comms.notif.call.incoming";

    @NotNull
    public static final String NO_HOMEGROUP_ID = "comms.call.homegroupid.noHomegroupId";

    @NotNull
    public static final String OK_SFX = ".ok";

    @NotNull
    public static final String OPEN_SFX = ".open";

    @NotNull
    public static final String OPTIN_SHOWN = "comms.call.perms.mpu.optin.shown";

    @NotNull
    public static final String OP_BIZ_CAPTURE_CALLING = "comms.api.bizmetrics.calling.capture";

    @NotNull
    public static final String OP_BIZ_CAPTURE_CALL_QUALITY = "comms.api.bizmetrics.callQuality.capture";

    @NotNull
    public static final String OP_CREATE_AUTH_TOKEN = "comms.api.auth.token.create";

    @NotNull
    public static final String OP_CREATE_CALL_ENDPOINTS = "comms.api.calling.endpoints.create";

    @NotNull
    public static final String OP_GET_DEVICE = "comms.api.calling.getDevices";

    @NotNull
    public static final String OP_GET_IDENTITY_PREFERENCES = "comms.api.ids.pref.get";

    @NotNull
    public static final String OP_GET_IDENTITY_V2 = "comms.api.ids.get";

    @NotNull
    public static final String OP_GET_MPU_ENABLED = "comms.api.calling.getMPUEnabled";

    @NotNull
    public static final String OP_GET_MPU_ENABLED_IOEXCEPTION = "comms.api.calling.getMPUEnabled.ioexception";

    @NotNull
    public static final String OP_GET_OR_CREATE_CONTACT = "comms.api.contacts.getOrCreate";

    @NotNull
    public static final String OP_GET_RECENT_COMMUNICATIONS = "comms.api.calling.getRecentCommunications";

    @NotNull
    public static final String OP_INITIATE_OUTBOUND_CALL = "comms.api.calling.initiateOutboundCall";

    @NotNull
    public static final String OP_UPDATE_IDENTITY_PREFERENCES = "comms.api.ids.pref.update";

    @NotNull
    public static final String PCC = "comms.directive.pcc";

    @NotNull
    public static final String PCC_ACCEPT_DIRECTIVE = "comms.directive.pcc.accept";

    @NotNull
    public static final String PCC_DIAL_DIRECTIVE = "comms.directive.pcc.dial";

    @NotNull
    public static final String PCC_STOP_DIRECTIVE = "comms.directive.pcc.stop";

    @NotNull
    public static final String PLACE_CALL = "comms.telecom.placeCall";

    @NotNull
    public static final String PLACE_CALL_CALLBACK = "comms.telecom.placeCall.callback";

    @NotNull
    public static final String PLACE_CALL_FAIL = "comms.telecom.placeCall.fail";

    @NotNull
    public static final String PLACE_CALL_PERMISSION_CRASH = "comms.telecom.place.call.permission.crash";

    @NotNull
    public static final String REACTION_THUMBNAIL_FAIL = "comms.call.reaction.thumbnail.fail";

    @NotNull
    public static final String REGISTER_PHONE_ACCOUNT = "comms.telecom.register.phone.account";

    @NotNull
    public static final String REGISTER_PHONE_ACCOUNT_FAIL = "comms.telecom.register.phone.account.fail";

    @NotNull
    public static final String REJECTING_ALEXA_AFTER_INCOMING_CONCURRENT_CALLS = "comms.telecom.reject.con.call";

    @NotNull
    public static final String REMOTE_PARTICIPANT_NAME_EMPTY_CALL_SCREEN_FAIL = "comms.call.participant.name.empty.callScreen.fail";

    @NotNull
    public static final String REMOTE_PARTICIPANT_NAME_EMPTY_FAIL = "comms.call.participant.name.empty.fail";

    @NotNull
    public static final String RETRY_SFX = ".retry";

    @NotNull
    public static final String REVOKE_SFX = ".revoke";

    @NotNull
    public static final String ROUTE_SELECTED = "comms.telecom.audiopicker.routeSelected";

    @NotNull
    public static final String SHOW_SFX = ".show";

    @NotNull
    public static final String SIP_AUTH_TOKEN_EXPIRING = "comms.sip.authToken.expiring";

    @NotNull
    public static final String SIP_INITIALIZATION_AWAIT_FAIL = "comms.call.sip.initializationAwait.fail";

    @NotNull
    public static final String SIP_REG_FAIL = "comms.sip.register.fail";

    @NotNull
    public static final String SIP_REG_FAIL_AS_ANOTHER_REG_IN_PROGRESS = "comms.sip.register.another.fail";

    @NotNull
    public static final String SIP_REG_FAIL_AT_AWAITSIP = "comms.sip.register.fail.awaitSIPRegistration";

    @NotNull
    public static final String SIP_SHUTDOWN_FAIL = "comms.sip.shutdown.fail";

    @NotNull
    public static final String SKYPE_APP_ACTION = "comms.app.Skype.App";

    @NotNull
    public static final String SKYPE_APP_ACTION_FAILED = "comms.app.Skype.App.fail";

    @NotNull
    public static final String SKYPE_REDIRECT_TO_MARKET_COUNT = "comms.app.Skype.Market";

    @NotNull
    public static final String SKYPE_REDIRECT_TO_MARKET_FAILED = "comms.app.Skype.Market.fail";

    @NotNull
    public static final String START_FOREGROUND = "comms.call.startForeground";

    @NotNull
    public static final String START_FOREGROUND_INCOMING_CALL_NOTIFICATION_FAIL = "comms.call.startForeground.incomingNotification.fail";

    @NotNull
    public static final String START_FOREGROUND_ONGOING_CALL_NOTIFICATION_FAIL = "comms.call.startForeground.ongoingNotification.fail";

    @NotNull
    public static final String SUCCESS_SFX = ".success";

    @NotNull
    private static final String TELECOM = "comms.telecom";

    @NotNull
    public static final String TELECOM_EMPTY_CALLER_NAME = "comms.telecom.caller.name.empty";

    @NotNull
    public static final String TELECOM_EMPTY_CALLID = "comms.telecom.callid.empty";

    @NotNull
    public static final String TELECOM_EMPTY_COMMS_ID = "comms.telecom.commsid.empty";

    @NotNull
    public static final String UNKNOWN_SFX = ".unknown";

    @NotNull
    public static final String VALUE_AT_COMMAND_FAILURE = "atCommandFailure";

    @NotNull
    public static final String VALUE_JSON_EXCEPTION = "jsonException";

    @NotNull
    public static final String VALUE_NO_PERMISSIONS = "noPermission";

    @NotNull
    public static final String VOX = ".vox";

    @NotNull
    public static final MetricKeys INSTANCE = new MetricKeys();

    @NotNull
    private static final String CSCREEN = "comms.screen";

    @NotNull
    private static final String SCREEN_CALL_ACTIVE = com.amazon.deecomms.common.metrics.MetricKeys.SCREEN_CALL_ACTIVE;

    @NotNull
    private static final String SCREEN_CALL_ACTIVE_RESUMED = com.amazon.deecomms.common.metrics.MetricKeys.SCREEN_CALL_ACTIVE.concat(".resumed");

    @NotNull
    private static final String SCREEN_CALL_ACTIVE_HOME_PRESSED = com.amazon.deecomms.common.metrics.MetricKeys.SCREEN_CALL_ACTIVE.concat(".homePressed");

    @NotNull
    private static final String SCREEN_CALL_ACTIVE_BACK_PRESSED = com.amazon.deecomms.common.metrics.MetricKeys.SCREEN_CALL_ACTIVE.concat(".backPressed");

    private MetricKeys() {
    }

    @NotNull
    public final String getSCREEN_CALL_ACTIVE_BACK_PRESSED() {
        return SCREEN_CALL_ACTIVE_BACK_PRESSED;
    }

    @NotNull
    public final String getSCREEN_CALL_ACTIVE_HOME_PRESSED() {
        return SCREEN_CALL_ACTIVE_HOME_PRESSED;
    }

    @NotNull
    public final String getSCREEN_CALL_ACTIVE_RESUMED() {
        return SCREEN_CALL_ACTIVE_RESUMED;
    }
}
