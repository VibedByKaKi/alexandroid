package com.amazon.rtcmedia.webrtc;

import android.opengl.GLES20;
import com.amazon.rtcmedia.util.RtcscLogger;
import java.nio.FloatBuffer;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlShader;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GlBlurDrawer implements RendererCommon.GlDrawer {
    private static final String BLUR_VERTEX_SHADER = "attribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvarying vec2 tc;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final int DEFAULT_BLUR_RADIUS = 64;
    private static final String FRAGMENT_SHADER_OES_BLUR = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 tc;\nuniform samplerExternalOES tex;\nuniform vec2 u_texelSize;\nuniform float u_blurRadius;\nvoid main() {\n  vec4 sum = vec4(0.0);\n  float totalWeight = 0.0;\n  float sigma = max(u_blurRadius * 0.5, 1.0);\n  float twoSigmaSq = 2.0 * sigma * sigma;\n  int radius = int(u_blurRadius);\n  for (int i = -64; i <= 64; i++) {\n    if (i < -radius || i > radius) continue;\n    float fi = float(i);\n    float weight = exp(-(fi * fi) / twoSigmaSq);\n    vec2 offset = vec2(u_texelSize.x * fi, 0.0);\n    sum += texture2D(tex, tc + offset) * weight;\n    totalWeight += weight;\n  }\n  gl_FragColor = sum / totalWeight;\n}\n";
    private static final String FRAGMENT_SHADER_RGB_BLUR = "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D tex;\nuniform vec2 u_texelSize;\nuniform float u_blurRadius;\nvoid main() {\n  vec4 sum = vec4(0.0);\n  float totalWeight = 0.0;\n  float sigma = max(u_blurRadius * 0.5, 1.0);\n  float twoSigmaSq = 2.0 * sigma * sigma;\n  int radius = int(u_blurRadius);\n  for (int i = -64; i <= 64; i++) {\n    if (i < -radius || i > radius) continue;\n    float fi = float(i);\n    float weight = exp(-(fi * fi) / twoSigmaSq);\n    vec2 offset = vec2(u_texelSize.x * fi, 0.0);\n    sum += texture2D(tex, tc + offset) * weight;\n    totalWeight += weight;\n  }\n  gl_FragColor = sum / totalWeight;\n}\n";
    private static final String FRAGMENT_SHADER_VERTICAL_BLUR = "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D tex;\nuniform vec2 u_texelSize;\nuniform float u_blurRadius;\nvoid main() {\n  vec4 sum = vec4(0.0);\n  float totalWeight = 0.0;\n  float sigma = max(u_blurRadius * 0.5, 1.0);\n  float twoSigmaSq = 2.0 * sigma * sigma;\n  int radius = int(u_blurRadius);\n  for (int i = -64; i <= 64; i++) {\n    if (i < -radius || i > radius) continue;\n    float fi = float(i);\n    float weight = exp(-(fi * fi) / twoSigmaSq);\n    vec2 offset = vec2(0.0, u_texelSize.y * fi);\n    sum += texture2D(tex, tc + offset) * weight;\n    totalWeight += weight;\n  }\n  gl_FragColor = sum / totalWeight;\n}\n";
    private static final String FRAGMENT_SHADER_YUV_BLUR = "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform vec2 u_texelSize;\nuniform float u_blurRadius;\nvec4 sampleYuv(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1.0);\n}\nvoid main() {\n  vec4 sum = vec4(0.0);\n  float totalWeight = 0.0;\n  float sigma = max(u_blurRadius * 0.5, 1.0);\n  float twoSigmaSq = 2.0 * sigma * sigma;\n  int radius = int(u_blurRadius);\n  for (int i = -64; i <= 64; i++) {\n    if (i < -radius || i > radius) continue;\n    float fi = float(i);\n    float weight = exp(-(fi * fi) / twoSigmaSq);\n    vec2 offset = vec2(u_texelSize.x * fi, 0.0);\n    sum += sampleYuv(tc + offset) * weight;\n    totalWeight += weight;\n  }\n  gl_FragColor = sum / totalWeight;\n}\n";
    private static final String SECOND_PASS_VERTEX_SHADER = "attribute vec4 in_pos;\nattribute vec4 in_tc;\nvarying vec2 tc;\nvoid main() {\n  gl_Position = in_pos;\n  tc = in_tc.xy;\n}\n";
    private GlShader oesBlurShader;
    private GlShader rgbBlurShader;
    private GlShader verticalBlurShader;
    private GlShader yuvBlurShader;
    private static final RtcscLogger mLog = RtcscLogger.getLogger(GlBlurDrawer.class);
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEX_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final Object blurStateLock = new Object();
    private boolean blurEnabled = false;
    private float blurStrength = 1.0f;
    private int blurRadius = 64;
    private int fboId = -1;
    private int fboTextureId = -1;
    private int fboWidth = 0;
    private int fboHeight = 0;
    private final GlRectDrawer passthroughDrawer = new GlRectDrawer();

    private void drawFirstPass(GlShader glShader, int i, int i2, float[] fArr, int i3, int i4, int i5) {
        glShader.useProgram();
        glShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUFFER);
        glShader.setVertexAttribArray("in_tc", 2, FULL_RECTANGLE_TEX_BUFFER);
        GLES20.glUniformMatrix4fv(glShader.getUniformLocation("tex_mat"), 1, false, fArr, 0);
        GLES20.glUniform1i(glShader.getUniformLocation("tex"), 0);
        GLES20.glUniform2f(glShader.getUniformLocation("u_texelSize"), 1.0f / i3, 1.0f / i4);
        GLES20.glUniform1f(glShader.getUniformLocation("u_blurRadius"), i5);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i2, i);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(i2, 0);
        GlUtil.checkNoGLES2Error("drawFirstPass");
    }

    private void drawSecondPass(int i, int i2, int i3) {
        this.verticalBlurShader.useProgram();
        this.verticalBlurShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUFFER);
        this.verticalBlurShader.setVertexAttribArray("in_tc", 2, FULL_RECTANGLE_TEX_BUFFER);
        GLES20.glUniform1i(this.verticalBlurShader.getUniformLocation("tex"), 0);
        GLES20.glUniform2f(this.verticalBlurShader.getUniformLocation("u_texelSize"), 1.0f / i, 1.0f / i2);
        GLES20.glUniform1f(this.verticalBlurShader.getUniformLocation("u_blurRadius"), i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.fboTextureId);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("drawSecondPass");
    }

    private void drawYuvFirstPass(GlShader glShader, int[] iArr, float[] fArr, int i, int i2, int i3) {
        glShader.useProgram();
        glShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUFFER);
        glShader.setVertexAttribArray("in_tc", 2, FULL_RECTANGLE_TEX_BUFFER);
        GLES20.glUniformMatrix4fv(glShader.getUniformLocation("tex_mat"), 1, false, fArr, 0);
        GLES20.glUniform1i(glShader.getUniformLocation("y_tex"), 0);
        GLES20.glUniform1i(glShader.getUniformLocation("u_tex"), 1);
        GLES20.glUniform1i(glShader.getUniformLocation("v_tex"), 2);
        GLES20.glUniform2f(glShader.getUniformLocation("u_texelSize"), 1.0f / i, 1.0f / i2);
        GLES20.glUniform1f(glShader.getUniformLocation("u_blurRadius"), i3);
        for (int i4 = 0; i4 < 3; i4++) {
            GLES20.glActiveTexture(33984 + i4);
            GLES20.glBindTexture(3553, iArr[i4]);
        }
        GLES20.glDrawArrays(5, 0, 4);
        for (int i5 = 0; i5 < 3; i5++) {
            GLES20.glActiveTexture(i5 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
        GlUtil.checkNoGLES2Error("drawYuvFirstPass");
    }

    private void ensureFbo(int i, int i2) {
        if (this.fboId != -1 && this.fboWidth == i && this.fboHeight == i2) {
            return;
        }
        releaseFbo();
        int generateTexture = GlUtil.generateTexture(3553);
        this.fboTextureId = generateTexture;
        GLES20.glBindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i3 = iArr[0];
        this.fboId = i3;
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.fboTextureId, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            mLog.e("FBO creation failed with status: " + glCheckFramebufferStatus);
            releaseFbo();
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.fboWidth = i;
        this.fboHeight = i2;
        GlUtil.checkNoGLES2Error("ensureFbo");
    }

    private void ensureVerticalBlurShader() {
        if (this.verticalBlurShader == null) {
            this.verticalBlurShader = new GlShader(SECOND_PASS_VERTEX_SHADER, FRAGMENT_SHADER_VERTICAL_BLUR);
        }
    }

    public static int getDefaultBlurRadius() {
        return 64;
    }

    private void releaseFbo() {
        int i = this.fboTextureId;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.fboTextureId = -1;
        }
        int i2 = this.fboId;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            this.fboId = -1;
        }
        this.fboWidth = 0;
        this.fboHeight = 0;
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        int i8;
        synchronized (this.blurStateLock) {
            try {
                z = this.blurEnabled && this.blurRadius > 0;
                i8 = this.blurRadius;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.passthroughDrawer.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
            return;
        }
        if (this.oesBlurShader == null) {
            this.oesBlurShader = new GlShader(BLUR_VERTEX_SHADER, FRAGMENT_SHADER_OES_BLUR);
        }
        ensureVerticalBlurShader();
        ensureFbo(i6, i7);
        GLES20.glBindFramebuffer(36160, this.fboId);
        GLES20.glViewport(0, 0, i6, i7);
        drawFirstPass(this.oesBlurShader, i, 36197, fArr, i6, i7, i8);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(i4, i5, i6, i7);
        drawSecondPass(i6, i7, i8);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        int i8;
        synchronized (this.blurStateLock) {
            try {
                z = this.blurEnabled && this.blurRadius > 0;
                i8 = this.blurRadius;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.passthroughDrawer.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
            return;
        }
        if (this.rgbBlurShader == null) {
            this.rgbBlurShader = new GlShader(BLUR_VERTEX_SHADER, FRAGMENT_SHADER_RGB_BLUR);
        }
        ensureVerticalBlurShader();
        ensureFbo(i6, i7);
        GLES20.glBindFramebuffer(36160, this.fboId);
        GLES20.glViewport(0, 0, i6, i7);
        drawFirstPass(this.rgbBlurShader, i, 3553, fArr, i6, i7, i8);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(i4, i5, i6, i7);
        drawSecondPass(i6, i7, i8);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7;
        synchronized (this.blurStateLock) {
            try {
                z = this.blurEnabled && this.blurRadius > 0;
                i7 = this.blurRadius;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.passthroughDrawer.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
            return;
        }
        if (this.yuvBlurShader == null) {
            this.yuvBlurShader = new GlShader(BLUR_VERTEX_SHADER, FRAGMENT_SHADER_YUV_BLUR);
        }
        ensureVerticalBlurShader();
        ensureFbo(i5, i6);
        GLES20.glBindFramebuffer(36160, this.fboId);
        GLES20.glViewport(0, 0, i5, i6);
        drawYuvFirstPass(this.yuvBlurShader, iArr, fArr, i5, i6, i7);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(i3, i4, i5, i6);
        drawSecondPass(i5, i6, i7);
    }

    public boolean isBlurEnabled() {
        boolean z;
        synchronized (this.blurStateLock) {
            z = this.blurEnabled;
        }
        return z;
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
        mLog.d("release");
        this.passthroughDrawer.release();
        GlShader glShader = this.oesBlurShader;
        if (glShader != null) {
            glShader.release();
            this.oesBlurShader = null;
        }
        GlShader glShader2 = this.rgbBlurShader;
        if (glShader2 != null) {
            glShader2.release();
            this.rgbBlurShader = null;
        }
        GlShader glShader3 = this.yuvBlurShader;
        if (glShader3 != null) {
            glShader3.release();
            this.yuvBlurShader = null;
        }
        GlShader glShader4 = this.verticalBlurShader;
        if (glShader4 != null) {
            glShader4.release();
            this.verticalBlurShader = null;
        }
        releaseFbo();
    }

    public void setBlurEnabled(boolean z, float f) {
        synchronized (this.blurStateLock) {
            this.blurEnabled = z;
            float max = Math.max(0.0f, Math.min(1.0f, f));
            this.blurStrength = max;
            this.blurRadius = Math.max(1, (int) (max * 64.0f));
        }
        mLog.d("setBlurEnabled: enabled=" + z + ", strength=" + f + ", radius=" + this.blurRadius);
    }
}
