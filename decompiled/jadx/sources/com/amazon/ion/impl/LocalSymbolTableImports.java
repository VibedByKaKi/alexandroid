package com.amazon.ion.impl;

import com.amazon.ion.SymbolTable;
import com.amazon.ion.SymbolToken;
import java.util.Arrays;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class LocalSymbolTableImports {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] myBaseSids;
    private final SymbolTable[] myImports;
    private final int myMaxId;

    public LocalSymbolTableImports(SymbolTable symbolTable, SymbolTable... symbolTableArr) {
        if (symbolTableArr == null || symbolTableArr.length <= 0) {
            this.myImports = new SymbolTable[]{symbolTable};
        } else if (symbolTableArr[0].isSystemTable()) {
            this.myImports = (SymbolTable[]) symbolTableArr.clone();
        } else {
            SymbolTable[] symbolTableArr2 = new SymbolTable[symbolTableArr.length + 1];
            this.myImports = symbolTableArr2;
            symbolTableArr2[0] = symbolTable;
            System.arraycopy(symbolTableArr, 0, symbolTableArr2, 1, symbolTableArr.length);
        }
        SymbolTable[] symbolTableArr3 = this.myImports;
        int[] iArr = new int[symbolTableArr3.length];
        this.myBaseSids = iArr;
        this.myMaxId = prepBaseSids(iArr, symbolTableArr3);
    }

    private static int prepBaseSids(int[] iArr, SymbolTable[] symbolTableArr) {
        SymbolTable symbolTable = symbolTableArr[0];
        iArr[0] = 0;
        int maxId = symbolTable.getMaxId();
        for (int i = 1; i < symbolTableArr.length; i++) {
            SymbolTable symbolTable2 = symbolTableArr[i];
            if (symbolTable2.isLocalTable() || symbolTable2.isSystemTable()) {
                Single$$ExternalSyntheticBUOutline0.m$3("only non-system shared tables can be imported");
                return 0;
            }
            iArr[i] = maxId;
            maxId += symbolTableArr[i].getMaxId();
        }
        return maxId;
    }

    public boolean equalImports(LocalSymbolTableImports localSymbolTableImports) {
        return Arrays.equals(this.myImports, localSymbolTableImports.myImports);
    }

    public SymbolToken find(String str) {
        int i = 0;
        while (true) {
            SymbolTable[] symbolTableArr = this.myImports;
            if (i >= symbolTableArr.length) {
                return null;
            }
            SymbolToken find = symbolTableArr[i].find(str);
            if (find != null) {
                return new SymbolTokenImpl(find.getText(), find.getSid() + this.myBaseSids[i]);
            }
            i++;
        }
    }

    public String findKnownSymbol(int i) {
        SymbolTable[] symbolTableArr;
        int i2;
        if (i > this.myMaxId) {
            return null;
        }
        int i3 = 0;
        int i4 = 1;
        while (true) {
            symbolTableArr = this.myImports;
            if (i4 >= symbolTableArr.length || i <= (i2 = this.myBaseSids[i4])) {
                break;
            }
            i4++;
            i3 = i2;
        }
        return symbolTableArr[i4 - 1].findKnownSymbol(i - i3);
    }

    public int findSymbol(String str) {
        SymbolToken find = find(str);
        if (find == null) {
            return -1;
        }
        return find.getSid();
    }

    public SymbolTable[] getImportedTables() {
        SymbolTable[] symbolTableArr = this.myImports;
        int length = symbolTableArr.length - 1;
        SymbolTable[] symbolTableArr2 = new SymbolTable[length];
        if (length > 0) {
            System.arraycopy(symbolTableArr, 1, symbolTableArr2, 0, length);
        }
        return symbolTableArr2;
    }

    public SymbolTable[] getImportedTablesNoCopy() {
        return this.myImports;
    }

    public int getMaxId() {
        return this.myMaxId;
    }

    public SymbolTable getSystemSymbolTable() {
        return this.myImports[0];
    }

    public String toString() {
        return Arrays.toString(this.myImports);
    }

    public LocalSymbolTableImports(List<SymbolTable> list) {
        int size = list.size();
        SymbolTable[] symbolTableArr = (SymbolTable[]) list.toArray(new SymbolTable[size]);
        this.myImports = symbolTableArr;
        int[] iArr = new int[size];
        this.myBaseSids = iArr;
        this.myMaxId = prepBaseSids(iArr, symbolTableArr);
    }
}
