package org.webrtc;

import android.opengl.GLES20;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram == 0) {
            Single$$ExternalSyntheticBUOutline0.m$1(GLES20.glGetError(), "glCreateProgram() failed. GLES20 error: ");
            throw null;
        }
        GLES20.glAttachShader(glCreateProgram, compileShader);
        GLES20.glAttachShader(this.program, compileShader2);
        GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(compileShader);
            GLES20.glDeleteShader(compileShader2);
            GlUtil.checkNoGLES2Error("Creating GlShader");
        } else {
            Logging.e(TAG, "Could not link program: " + GLES20.glGetProgramInfoLog(this.program));
            Single$$ExternalSyntheticBUOutline0.m(GLES20.glGetProgramInfoLog(this.program));
            throw null;
        }
    }

    private static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            Single$$ExternalSyntheticBUOutline0.m$1(GLES20.glGetError(), "glCreateShader() failed. GLES20 error: ");
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            GlUtil.checkNoGLES2Error("compileShader");
            return glCreateShader;
        }
        Logging.e(TAG, "Compile error " + GLES20.glGetShaderInfoLog(glCreateShader) + " in shader:\n" + str);
        Single$$ExternalSyntheticBUOutline0.m(GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i == -1) {
            Single$$ExternalSyntheticBUOutline0.m("The program has been released");
            return 0;
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Could not locate '", str, "' in program"));
        return 0;
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i == -1) {
            Single$$ExternalSyntheticBUOutline0.m("The program has been released");
            return 0;
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Could not locate uniform '", str, "' in program"));
        return 0;
    }

    public void release() {
        Logging.d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program == -1) {
            Single$$ExternalSyntheticBUOutline0.m("The program has been released");
            return;
        }
        int attribLocation = getAttribLocation(str);
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("setVertexAttribArray");
    }

    public void useProgram() {
        if (this.program == -1) {
            Single$$ExternalSyntheticBUOutline0.m("The program has been released");
            return;
        }
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(this.program);
        }
        GlUtil.checkNoGLES2Error("glUseProgram");
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }
}
