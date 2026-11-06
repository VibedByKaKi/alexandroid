package com.mapbox.maps.extension.style.expressions.dsl.generated;

import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.common.callercontext.ContextChain;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0013\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0001\u001a\u001f\u0010\n\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a\u001f\u0010\f\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\r\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010\u0010\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u001f\u0010\u0012\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0016\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0018\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0010\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u001d\u001a\u00020\u00012\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\"\u00020 ¢\u0006\u0002\u0010!\u001a\u001f\u0010\"\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010#\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010#\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&\u001a\u0006\u0010'\u001a\u00020\u0001\u001a\u001f\u0010(\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0016\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b\u001a\u001f\u0010+\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020 \u001a\u0006\u0010,\u001a\u00020\u0001\u001a\u001f\u0010-\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010.\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010/\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010/\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u00100\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0006\u00102\u001a\u00020\u0001\u001a\u001f\u00103\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020 \u001a\u0016\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0001\u001a\u001f\u00106\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u00107\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u00108\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020 \u001a\u0016\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020 2\u0006\u00105\u001a\u00020\u0001\u001a\u0006\u0010:\u001a\u00020\u0001\u001a\u001f\u0010;\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010<\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0006\u0010=\u001a\u00020\u0001\u001a\u001f\u0010>\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010@\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0016\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u0001\u001a\u0016\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u0001\u001a\u001f\u0010C\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010D\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010E\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020 \u001a\u001f\u0010G\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010G\u001a\u00020\u00012\u0006\u00109\u001a\u00020 \u001a\u001f\u0010H\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0006\u0010I\u001a\u00020\u0001\u001a\u001a\u0010J\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020L0K\u001a\u000e\u0010J\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020M\u001a\u000e\u0010J\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010J\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020N\u001a\u000e\u0010J\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020 \u001a\u0014\u0010J\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020L0O\u001a\u001f\u0010P\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010P\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010Q\u001a\u00020\u0001\u001a\u001f\u0010R\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010R\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010S\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010S\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010T\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010U\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010V\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010W\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0012\u0010W\u001a\u00020\u00012\n\u0010\u001e\u001a\u00020X\"\u00020\b\u001a\u001f\u0010Y\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010Z\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0012\u0010Z\u001a\u00020\u00012\n\u0010\u001e\u001a\u00020X\"\u00020\b\u001a\u001f\u0010[\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0016\u0010[\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b\u001a\u001f\u0010\\\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010]\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020M\u001a\u001f\u0010_\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a'\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010c\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0006\u0010d\u001a\u00020\u0001\u001a\u0006\u0010e\u001a\u00020\u0001\u001a\u001f\u0010f\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0016\u0010f\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b\u001a\u001f\u0010g\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0012\u0010g\u001a\u00020\u00012\n\u0010h\u001a\u00020X\"\u00020\b\u001a\u0006\u0010i\u001a\u00020\u0001\u001a\u001f\u0010j\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0006\u0010k\u001a\u00020\u0001\u001a\u0006\u0010l\u001a\u00020\u0001\u001a\u001f\u0010m\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010n\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001e\u0010n\u001a\u00020\u00012\u0006\u0010o\u001a\u00020\b2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\b\u001a\u001f\u0010r\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a&\u0010r\u001a\u00020\u00012\u0006\u0010o\u001a\u00020\b2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b\u001a\u001f\u0010t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010u\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010u\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010v\u001a\u00020\u0001\u001a\u001f\u0010w\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010x\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010y\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010y\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010z\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u00109\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010{\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010{\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010{\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b\u001a\u001f\u0010|\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0012\u0010|\u001a\u00020\u00012\n\u0010h\u001a\u00020X\"\u00020\b\u001a\u001f\u0010}\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010~\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000e\u0010~\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u001f\u0010\u007f\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0080\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0081\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0082\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0083\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0084\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0085\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a \u0010\u0086\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000f\u0010\u0086\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020 \u001a \u0010\u0087\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u000f\u0010\u0087\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020 \u001a\u0011\u0010\u0088\u0001\u001a\u00020\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001\u001a \u0010\u008b\u0001\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u0007\u0010\u008c\u0001\u001a\u00020\u0001¨\u0006\u008d\u0001"}, d2 = {"abs", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "value", "", "accumulated", "acos", "activeAnchor", "all", Languages.ANY, "array", "asin", "at", "index", "atInterpolated", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "atan", TypedValues.Custom.S_BOOLEAN, "ceil", "coalesce", "collator", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "color", "intColor", "", "concat", "values", "", "", "([Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "config", "cos", "distance", "geojson", "Lcom/mapbox/geojson/GeoJson;", "distanceFromCenter", "division", DefaultPreloadManager.METRIC_PATH_FIRST, "second", "downcase", "e", "eq", "featureState", "floor", "format", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "geometryType", MetricsConstants.Method.CACHE_GET, "key", "expression", "gt", "gte", "has", TypedValues.Custom.S_STRING, "heatmapDensity", "hsl", "hsla", "id", "image", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "inExpression", "needle", "haystack", "indexOf", "interpolate", "isSupportedScript", "script", "length", "letExpression", "lineProgress", "literal", "Ljava/util/HashMap;", "", "", "", "", "ln", "ln2", "log10", "log2", "lt", "lte", "match", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "", "measureLight", ReactProperties.GEOFENCE_MINIMUM_RANGE, "mod", "neq", SmartPlayConstants.SMART_PLAY_NOT_CONDITION_PREFIX, "bool", "number", "numberFormat", "input", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "objectExpression", ContextChain.TAG_PRODUCT_AND_INFRA, ResponseFields.PITCH, "pow", AMPDInformationProvider.DEVICE_PRODUCT_KEY, "double", "properties", "random", "rasterParticleSpeed", "rasterValue", "resolvedLocale", "rgb", "red", "green", "blue", "rgba", "alpha", "round", "sin", "skyRadialProgress", "slice", "split", "sqrt", "step", "subtract", "sum", "switchCase", "tan", "toBoolean", "toColor", "toHsla", "toNumber", "toRgba", "toString", "typeofExpression", "upcase", "varExpression", "within", "geometry", "Lcom/mapbox/geojson/Geometry;", "worldview", "zoom", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpressionDslKt {
    @NotNull
    public static final Expression abs(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.abs(function1);
    }

    @NotNull
    public static final Expression accumulated() {
        return Expression.INSTANCE.accumulated();
    }

    @NotNull
    public static final Expression acos(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.acos(function1);
    }

    @MapboxExperimental
    @NotNull
    public static final Expression activeAnchor() {
        return Expression.INSTANCE.activeAnchor();
    }

    @NotNull
    public static final Expression all(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.all(function1);
    }

    @NotNull
    public static final Expression any(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.any(function1);
    }

    @NotNull
    public static final Expression array(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.array(function1);
    }

    @NotNull
    public static final Expression asin(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.asin(function1);
    }

    @NotNull
    public static final Expression at(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.at(function1);
    }

    @NotNull
    public static final Expression atInterpolated(@NotNull Function1<? super Expression.InterpolatorBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.atInterpolated(function1);
    }

    @NotNull
    public static final Expression atan(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.atan(function1);
    }

    @NotNull
    /* renamed from: boolean, reason: not valid java name */
    public static final Expression m24746boolean(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.m24748boolean(function1);
    }

    @NotNull
    public static final Expression ceil(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.ceil(function1);
    }

    @NotNull
    public static final Expression coalesce(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.coalesce(function1);
    }

    @NotNull
    public static final Expression collator(@NotNull Function1<? super Expression.CollatorBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.collator(function1);
    }

    @NotNull
    public static final Expression color(@ColorInt int i) {
        return Expression.INSTANCE.color(i);
    }

    @NotNull
    public static final Expression concat(@NotNull String... strArr) {
        strArr.getClass();
        return Expression.INSTANCE.concat((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public static final Expression config(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.config(function1);
    }

    @NotNull
    public static final Expression cos(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.cos(function1);
    }

    @NotNull
    public static final Expression distance(@NotNull GeoJson geoJson) {
        geoJson.getClass();
        return Expression.INSTANCE.distance(geoJson);
    }

    @NotNull
    public static final Expression distanceFromCenter() {
        return Expression.INSTANCE.distanceFromCenter();
    }

    @NotNull
    public static final Expression division(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.division(function1);
    }

    @NotNull
    public static final Expression downcase(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.downcase(function1);
    }

    @NotNull
    public static final Expression e() {
        return Expression.INSTANCE.e();
    }

    @NotNull
    public static final Expression eq(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.eq(function1);
    }

    @NotNull
    public static final Expression featureState(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.featureState(function1);
    }

    @NotNull
    public static final Expression floor(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.floor(function1);
    }

    @NotNull
    public static final Expression format(@NotNull Function1<? super Expression.FormatBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.format(function1);
    }

    @NotNull
    public static final Expression geometryType() {
        return Expression.INSTANCE.geometryType();
    }

    @NotNull
    public static final Expression get(@NotNull String str, @NotNull Expression expression) {
        str.getClass();
        expression.getClass();
        return Expression.INSTANCE.get(str, expression);
    }

    @NotNull
    public static final Expression gt(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.gt(function1);
    }

    @NotNull
    public static final Expression gte(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.gte(function1);
    }

    @NotNull
    public static final Expression has(@NotNull String str, @NotNull Expression expression) {
        str.getClass();
        expression.getClass();
        return Expression.INSTANCE.has(str, expression);
    }

    @NotNull
    public static final Expression heatmapDensity() {
        return Expression.INSTANCE.heatmapDensity();
    }

    @NotNull
    public static final Expression hsl(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.hsl(function1);
    }

    @NotNull
    public static final Expression hsla(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.hsla(function1);
    }

    @NotNull
    public static final Expression id() {
        return Expression.INSTANCE.id();
    }

    @NotNull
    public static final Expression image(@NotNull Function1<? super Expression.ImageBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.image(function1);
    }

    @NotNull
    public static final Expression inExpression(@NotNull String str, @NotNull Expression expression) {
        str.getClass();
        expression.getClass();
        return Expression.INSTANCE.inExpression(str, expression);
    }

    @NotNull
    public static final Expression indexOf(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.indexOf(function1);
    }

    @NotNull
    public static final Expression interpolate(@NotNull Function1<? super Expression.InterpolatorBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.interpolate(function1);
    }

    @NotNull
    public static final Expression isSupportedScript(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.isSupportedScript(function1);
    }

    @NotNull
    public static final Expression length(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.length(function1);
    }

    @NotNull
    public static final Expression letExpression(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.letExpression(function1);
    }

    @NotNull
    public static final Expression lineProgress() {
        return Expression.INSTANCE.lineProgress();
    }

    @NotNull
    public static final Expression literal(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.literal(str);
    }

    @NotNull
    public static final Expression ln(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.ln(function1);
    }

    @NotNull
    public static final Expression ln2() {
        return Expression.INSTANCE.ln2();
    }

    @NotNull
    public static final Expression log10(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.log10(function1);
    }

    @NotNull
    public static final Expression log2(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.log2(function1);
    }

    @NotNull
    public static final Expression lt(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.lt(function1);
    }

    @NotNull
    public static final Expression lte(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.lte(function1);
    }

    @NotNull
    public static final Expression match(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.match(function1);
    }

    @NotNull
    public static final Expression max(@NotNull double... dArr) {
        dArr.getClass();
        return Expression.INSTANCE.max(Arrays.copyOf(dArr, dArr.length));
    }

    @NotNull
    public static final Expression measureLight(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.measureLight(function1);
    }

    @NotNull
    public static final Expression min(@NotNull double... dArr) {
        dArr.getClass();
        return Expression.INSTANCE.min(Arrays.copyOf(dArr, dArr.length));
    }

    @NotNull
    public static final Expression mod(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.mod(function1);
    }

    @NotNull
    public static final Expression neq(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.neq(function1);
    }

    @NotNull
    public static final Expression not(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.not(function1);
    }

    @NotNull
    public static final Expression number(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.number(function1);
    }

    @NotNull
    public static final Expression numberFormat(@NotNull Expression expression, @NotNull Function1<? super Expression.NumberFormatBuilder, Unit> function1) {
        expression.getClass();
        function1.getClass();
        return Expression.INSTANCE.numberFormat(expression, function1);
    }

    @NotNull
    public static final Expression objectExpression(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.objectExpression(function1);
    }

    @NotNull
    public static final Expression pi() {
        return Expression.INSTANCE.pi();
    }

    @NotNull
    public static final Expression pitch() {
        return Expression.INSTANCE.pitch();
    }

    @NotNull
    public static final Expression pow(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.pow(function1);
    }

    @NotNull
    public static final Expression product(@NotNull double... dArr) {
        dArr.getClass();
        return Expression.INSTANCE.product(Arrays.copyOf(dArr, dArr.length));
    }

    @NotNull
    public static final Expression properties() {
        return Expression.INSTANCE.properties();
    }

    @NotNull
    public static final Expression random(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.random(function1);
    }

    @NotNull
    public static final Expression rasterParticleSpeed() {
        return Expression.INSTANCE.rasterParticleSpeed();
    }

    @NotNull
    public static final Expression rasterValue() {
        return Expression.INSTANCE.rasterValue();
    }

    @NotNull
    public static final Expression resolvedLocale(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.resolvedLocale(function1);
    }

    @NotNull
    public static final Expression rgb(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.rgb(function1);
    }

    @NotNull
    public static final Expression rgba(double d, double d2, double d3, double d4) {
        return Expression.INSTANCE.rgba(d, d2, d3, d4);
    }

    @NotNull
    public static final Expression round(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.round(function1);
    }

    @NotNull
    public static final Expression sin(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.sin(function1);
    }

    @NotNull
    public static final Expression skyRadialProgress() {
        return Expression.INSTANCE.skyRadialProgress();
    }

    @NotNull
    public static final Expression slice(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.slice(function1);
    }

    @NotNull
    public static final Expression split(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.split(function1);
    }

    @NotNull
    public static final Expression sqrt(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.sqrt(function1);
    }

    @NotNull
    public static final Expression step(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.step(function1);
    }

    @NotNull
    public static final Expression string(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.string(function1);
    }

    @NotNull
    public static final Expression subtract(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.subtract(function1);
    }

    @NotNull
    public static final Expression sum(@NotNull double... dArr) {
        dArr.getClass();
        return Expression.INSTANCE.sum(Arrays.copyOf(dArr, dArr.length));
    }

    @NotNull
    public static final Expression switchCase(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.switchCase(function1);
    }

    @NotNull
    public static final Expression tan(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.tan(function1);
    }

    @NotNull
    public static final Expression toBoolean(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toBoolean(function1);
    }

    @NotNull
    public static final Expression toColor(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toColor(function1);
    }

    @NotNull
    public static final Expression toHsla(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toHsla(function1);
    }

    @NotNull
    public static final Expression toNumber(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toNumber(function1);
    }

    @NotNull
    public static final Expression toRgba(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toRgba(function1);
    }

    @NotNull
    public static final Expression toString(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.toString(function1);
    }

    @NotNull
    public static final Expression typeofExpression(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.typeofExpression(function1);
    }

    @NotNull
    public static final Expression upcase(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.upcase(function1);
    }

    @NotNull
    public static final Expression varExpression(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.varExpression(function1);
    }

    @NotNull
    public static final Expression within(@NotNull Geometry geometry) {
        geometry.getClass();
        return Expression.INSTANCE.within(geometry);
    }

    @NotNull
    public static final Expression worldview(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.worldview(function1);
    }

    @NotNull
    public static final Expression zoom() {
        return Expression.INSTANCE.zoom();
    }

    @NotNull
    public static final Expression abs(double d) {
        return Expression.INSTANCE.abs(d);
    }

    @NotNull
    public static final Expression acos(double d) {
        return Expression.INSTANCE.acos(d);
    }

    @NotNull
    public static final Expression asin(double d) {
        return Expression.INSTANCE.asin(d);
    }

    @NotNull
    public static final Expression at(double d, @NotNull Expression expression) {
        expression.getClass();
        return Expression.INSTANCE.at(d, expression);
    }

    @NotNull
    public static final Expression atan(double d) {
        return Expression.INSTANCE.atan(d);
    }

    @NotNull
    public static final Expression ceil(double d) {
        return Expression.INSTANCE.ceil(d);
    }

    @NotNull
    public static final Expression cos(double d) {
        return Expression.INSTANCE.cos(d);
    }

    @NotNull
    public static final Expression division(double d, double d2) {
        return Expression.INSTANCE.division(d, d2);
    }

    @NotNull
    public static final Expression downcase(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.downcase(str);
    }

    @NotNull
    public static final Expression floor(double d) {
        return Expression.INSTANCE.floor(d);
    }

    @NotNull
    public static final Expression isSupportedScript(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.isSupportedScript(str);
    }

    @NotNull
    public static final Expression length(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.length(str);
    }

    @NotNull
    public static final Expression literal(long j) {
        return Expression.INSTANCE.literal(j);
    }

    @NotNull
    public static final Expression ln(double d) {
        return Expression.INSTANCE.ln(d);
    }

    @NotNull
    public static final Expression log10(double d) {
        return Expression.INSTANCE.log10(d);
    }

    @NotNull
    public static final Expression log2(double d) {
        return Expression.INSTANCE.log2(d);
    }

    @NotNull
    public static final Expression mod(double d, double d2) {
        return Expression.INSTANCE.mod(d, d2);
    }

    @NotNull
    public static final Expression not(boolean z) {
        return Expression.INSTANCE.not(z);
    }

    @NotNull
    public static final Expression pow(double d, double d2) {
        return Expression.INSTANCE.pow(d, d2);
    }

    @NotNull
    public static final Expression rgb(double d, double d2, double d3) {
        return Expression.INSTANCE.rgb(d, d2, d3);
    }

    @NotNull
    public static final Expression round(double d) {
        return Expression.INSTANCE.round(d);
    }

    @NotNull
    public static final Expression sin(double d) {
        return Expression.INSTANCE.sin(d);
    }

    @NotNull
    public static final Expression sqrt(double d) {
        return Expression.INSTANCE.sqrt(d);
    }

    @NotNull
    public static final Expression subtract(double d, double d2) {
        return Expression.INSTANCE.subtract(d, d2);
    }

    @NotNull
    public static final Expression tan(double d) {
        return Expression.INSTANCE.tan(d);
    }

    @NotNull
    public static final Expression upcase(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.upcase(str);
    }

    @NotNull
    public static final Expression varExpression(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.varExpression(str);
    }

    @NotNull
    public static final Expression literal(boolean z) {
        return Expression.INSTANCE.literal(z);
    }

    @NotNull
    public static final Expression rgba(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.rgba(function1);
    }

    @NotNull
    public static final Expression subtract(double d) {
        return Expression.INSTANCE.subtract(d);
    }

    @NotNull
    public static final Expression literal(double d) {
        return Expression.INSTANCE.literal(d);
    }

    @NotNull
    public static final Expression get(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.get(str);
    }

    @NotNull
    public static final Expression has(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.has(function1);
    }

    @NotNull
    public static final Expression inExpression(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.inExpression(function1);
    }

    @NotNull
    public static final Expression literal(@NotNull List<? extends Object> list) {
        list.getClass();
        return Expression.INSTANCE.literal$extension_style_release(list);
    }

    @NotNull
    public static final Expression get(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.get(function1);
    }

    @NotNull
    public static final Expression has(@NotNull String str) {
        str.getClass();
        return Expression.INSTANCE.has(str);
    }

    @NotNull
    public static final Expression inExpression(double d, @NotNull Expression expression) {
        expression.getClass();
        return Expression.INSTANCE.inExpression(d, expression);
    }

    @NotNull
    public static final Expression literal(@NotNull HashMap<String, Object> hashMap) {
        hashMap.getClass();
        return Expression.INSTANCE.literal$extension_style_release(hashMap);
    }

    @NotNull
    public static final Expression max(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.max(function1);
    }

    @NotNull
    public static final Expression min(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.min(function1);
    }

    @NotNull
    public static final Expression product(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.product(function1);
    }

    @NotNull
    public static final Expression sum(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.sum(function1);
    }

    @NotNull
    public static final Expression concat(@NotNull Function1<? super Expression.ExpressionBuilder, Unit> function1) {
        function1.getClass();
        return Expression.INSTANCE.concat(function1);
    }
}
