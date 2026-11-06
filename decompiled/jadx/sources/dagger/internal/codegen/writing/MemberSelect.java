package dagger.internal.codegen.writing;

import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import dagger.internal.codegen.writing.ComponentImplementation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class MemberSelect {
    private final ClassName owningClass;
    private final boolean staticMember;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LocalField extends MemberSelect {
        final String fieldName;
        final ComponentImplementation.ShardImplementation owningShard;

        public LocalField(ComponentImplementation.ShardImplementation shardImplementation, String str) {
            super(shardImplementation.name(), false);
            this.owningShard = shardImplementation;
            this.fieldName = (String) Preconditions.checkNotNull(str);
        }

        @Override // dagger.internal.codegen.writing.MemberSelect
        public CodeBlock getExpressionFor(ClassName className) {
            return owningClass().equals(className) ? CodeBlock.of("$N", this.fieldName) : CodeBlock.of("$L.$N", this.owningShard.shardFieldReference(), this.fieldName);
        }
    }

    public MemberSelect(ClassName className, boolean z) {
        this.owningClass = className;
        this.staticMember = z;
    }

    public static MemberSelect localField(ComponentImplementation.ShardImplementation shardImplementation, String str) {
        return new LocalField(shardImplementation, str);
    }

    public abstract CodeBlock getExpressionFor(ClassName className);

    public ClassName owningClass() {
        return this.owningClass;
    }

    public boolean staticMember() {
        return this.staticMember;
    }
}
