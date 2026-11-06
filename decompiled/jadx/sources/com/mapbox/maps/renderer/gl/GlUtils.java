package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.dee.app.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u000b2\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\n\u0010\u0014\u001a\u00020\u0011*\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/renderer/gl/GlUtils;", "", "()V", "checkCompileStatus", "", "shader", "", "checkError", "cmd", "", "getIdentityMatrix", "", "loadShader", "type", "shaderCode", "throwIfError", MetricsConstants.Method.CACHE_PUT, "Ljava/nio/FloatBuffer;", "values", "", "toFloatBuffer", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class GlUtils {

    @NotNull
    public static final GlUtils INSTANCE = new GlUtils();

    private GlUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfError(String cmd) {
        Object obj;
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(cmd, " - error in GL : ");
            switch (glGetError) {
                case 1280:
                    obj = "GL_INVALID_ENUM";
                    break;
                case 1281:
                    obj = "GL_INVALID_VALUE";
                    break;
                case 1282:
                    obj = "GL_INVALID_OPERATION";
                    break;
                case 1283:
                case 1284:
                default:
                    obj = Integer.valueOf(glGetError);
                    break;
                case 1285:
                    obj = "GL_OUT_OF_MEMORY";
                    break;
                case 1286:
                    obj = "GL_INVALID_FRAMEBUFFER_OPERATION";
                    break;
            }
            m1m.append(obj);
            throw new RuntimeException(m1m.toString());
        }
    }

    @NotNull
    public final float[] getIdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public final int loadShader(int type, @NotNull String shaderCode) {
        shaderCode.getClass();
        int glCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(glCreateShader, shaderCode);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public final void put(@NotNull FloatBuffer floatBuffer, @NotNull float... fArr) {
        floatBuffer.getClass();
        fArr.getClass();
        floatBuffer.rewind();
        for (float f : fArr) {
            floatBuffer.put(f);
        }
        floatBuffer.rewind();
    }

    @NotNull
    public final FloatBuffer toFloatBuffer(@NotNull float[] fArr) {
        fArr.getClass();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    public final void checkCompileStatus(int shader) {
    }

    public final void checkError(@Nullable String cmd) {
    }

    public final void put(@NotNull float[] fArr, @NotNull float... fArr2) {
        fArr.getClass();
        fArr2.getClass();
        int length = fArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fArr[i2] = fArr2[i];
            i++;
            i2++;
        }
    }

    public static /* synthetic */ void checkError$default(GlUtils glUtils, String str, int i, Object obj) {
    }
}
