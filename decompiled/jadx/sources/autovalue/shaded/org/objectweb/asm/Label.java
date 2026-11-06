package autovalue.shaded.org.objectweb.asm;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.UShort;
import org.eclipse.paho.client.mqttv3.MqttException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_LINE_NUMBER = 128;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_RESOLVED = 4;
    static final int FLAG_SUBROUTINE_CALLER = 16;
    static final int FLAG_SUBROUTINE_END = 64;
    static final int FLAG_SUBROUTINE_START = 32;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_STACK_MAP = 805306368;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    public Object info;
    short inputStackSize;
    private short lineNumber;
    Label nextBasicBlock;
    Label nextListElement;
    private int[] otherLineNumbers;
    Edge outgoingEdges;
    short outputStackMax;
    short outputStackSize;
    short subroutineId;

    private void addForwardReference(int i, int i2, int i3) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i4 = iArr[0];
        if (i4 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i4 + 1] = i;
        int i5 = i4 + 2;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    private Label pushSuccessors(Label label) {
        for (Edge edge = this.outgoingEdges; edge != null; edge = edge.nextEdge) {
            if ((this.flags & 16) == 0 || edge != this.outgoingEdges.nextEdge) {
                Label label2 = edge.successor;
                if (label2.nextListElement == null) {
                    label2.nextListElement = label;
                    label = label2;
                }
            }
        }
        return label;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return a$$ExternalSyntheticOutline0.m(i, "L");
    }

    public final void accept(MethodVisitor methodVisitor, boolean z) {
        methodVisitor.visitLabel(this);
        if (!z || (this.flags & MqttException.REASON_CODE_SUBSCRIBE_FAILED) == 0) {
            return;
        }
        methodVisitor.visitLineNumber(this.lineNumber & UShort.MAX_VALUE, this);
        if (this.otherLineNumbers == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.otherLineNumbers;
            if (i > iArr[0]) {
                return;
            }
            methodVisitor.visitLineNumber(iArr[i], this);
            i++;
        }
    }

    public final void addLineNumber(int i) {
        short s = this.flags;
        if ((s & MqttException.REASON_CODE_SUBSCRIBE_FAILED) == 0) {
            this.flags = (short) (s | MqttException.REASON_CODE_SUBSCRIBE_FAILED);
            this.lineNumber = (short) i;
            return;
        }
        if (this.otherLineNumbers == null) {
            this.otherLineNumbers = new int[4];
        }
        int[] iArr = this.otherLineNumbers;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.otherLineNumbers = iArr2;
        }
        this.otherLineNumbers[i2] = i;
    }

    public final void addSubroutineRetSuccessors(Label label) {
        Label label2 = EMPTY_LIST;
        this.nextListElement = label2;
        while (this != EMPTY_LIST) {
            Label label3 = this.nextListElement;
            this.nextListElement = label2;
            if ((this.flags & 64) != 0 && this.subroutineId != label.subroutineId) {
                this.outgoingEdges = new Edge(this.outputStackSize, label.outgoingEdges.successor, this.outgoingEdges);
            }
            label2 = this;
            this = this.pushSuccessors(label3);
        }
        while (label2 != EMPTY_LIST) {
            Label label4 = label2.nextListElement;
            label2.nextListElement = null;
            label2 = label4;
        }
    }

    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    public int getOffset() {
        if ((this.flags & 4) != 0) {
            return this.bytecodeOffset;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Label offset position has not been resolved yet");
        return 0;
    }

    public final void markSubroutine(short s) {
        this.nextListElement = EMPTY_LIST;
        while (this != EMPTY_LIST) {
            Label label = this.nextListElement;
            this.nextListElement = null;
            if (this.subroutineId == 0) {
                this.subroutineId = s;
                this = this.pushSuccessors(label);
            } else {
                this = label;
            }
        }
    }

    public final void put(ByteVector byteVector, int i, boolean z) {
        if ((this.flags & 4) != 0) {
            int i2 = this.bytecodeOffset;
            if (z) {
                byteVector.putInt(i2 - i);
                return;
            } else {
                byteVector.putShort(i2 - i);
                return;
            }
        }
        if (z) {
            addForwardReference(i, 536870912, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i, 268435456, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public final boolean resolve(byte[] bArr, ByteVector byteVector, int i) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i;
        int[] iArr = this.forwardReferences;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = FORWARD_REFERENCE_HANDLE_MASK & i4;
            int i7 = i4 & FORWARD_REFERENCE_TYPE_MASK;
            if (i7 == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i8 = bArr[i3] & 255;
                    if (i8 < 198) {
                        bArr[i3] = (byte) (i8 + 49);
                    } else {
                        bArr[i3] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else if (i7 == 536870912) {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            } else {
                byte[] bArr2 = byteVector.data;
                bArr2[i6] = (byte) (i >>> 8);
                bArr2[i6 + 1] = (byte) i;
            }
        }
        return z;
    }

    public String toString() {
        return stringConcat$0(System.identityHashCode(this));
    }

    public final void put(ByteVector byteVector) {
        if ((this.flags & 4) == 0) {
            addForwardReference(0, 805306368, byteVector.length);
        }
        byteVector.putShort(this.bytecodeOffset);
    }
}
