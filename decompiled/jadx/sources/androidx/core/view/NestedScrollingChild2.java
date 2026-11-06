package androidx.core.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5);

    boolean hasNestedScrollingParent(int i);

    boolean startNestedScroll(int i, int i2);

    void stopNestedScroll(int i);
}
