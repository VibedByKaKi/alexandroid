package androidx.media3.exoplayer.video.spherical;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i2) {
            this.textureId = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i2;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5 = i;
        Assertions.checkArgument(f > 0.0f);
        Assertions.checkArgument(i5 >= 1);
        Assertions.checkArgument(i2 >= 1);
        Assertions.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f4 = radians / i5;
        float f5 = radians2 / i2;
        int i6 = i2 + 1;
        int m$1 = ParcelCompat$$ExternalSyntheticOutline0.m$1(i6, 2, 2, i5);
        float[] fArr = new float[m$1 * 3];
        float[] fArr2 = new float[m$1 * 2];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i5) {
            float f6 = radians / 2.0f;
            float f7 = (i7 * f4) - f6;
            int i10 = i7 + 1;
            float f8 = (i10 * f4) - f6;
            int i11 = 0;
            while (i11 < i6) {
                float f9 = radians;
                float f10 = radians2;
                int i12 = 0;
                int i13 = 2;
                while (i12 < i13) {
                    float f11 = f4;
                    float f12 = i11 * f5;
                    float f13 = f5;
                    float f14 = f7;
                    double d = f;
                    double d2 = (f12 + 3.1415927f) - (f10 / 2.0f);
                    double d3 = i12 == 0 ? f7 : f8;
                    fArr[i8] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    fArr[i8 + 1] = (float) (Math.sin(d3) * d);
                    int i14 = i8 + 3;
                    fArr[i8 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                    fArr2[i9] = f12 / f10;
                    int i15 = i9 + 2;
                    fArr2[i9 + 1] = ((i7 + i12) * f11) / f9;
                    if ((i11 == 0 && i12 == 0) || (i11 == i2 && i12 == 1)) {
                        System.arraycopy(fArr, i8, fArr, i14, 3);
                        i8 += 6;
                        i4 = 2;
                        System.arraycopy(fArr2, i9, fArr2, i15, 2);
                        i9 += 4;
                    } else {
                        i4 = 2;
                        i8 = i14;
                        i9 = i15;
                    }
                    i12++;
                    i13 = i4;
                    f4 = f11;
                    f5 = f13;
                    f7 = f14;
                }
                i11++;
                radians2 = f10;
                radians = f9;
                f4 = f4;
            }
            i5 = i;
            i7 = i10;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i3);
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
