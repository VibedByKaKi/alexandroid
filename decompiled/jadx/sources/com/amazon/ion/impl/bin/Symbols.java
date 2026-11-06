package com.amazon.ion.impl.bin;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.ion.SymbolTable;
import com.amazon.ion.SymbolToken;
import com.amazon.ion.SystemSymbols;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class Symbols {
    private static SymbolTable SYSTEM_SYMBOL_TABLE;
    private static final List<SymbolToken> SYSTEM_TOKENS;
    private static final Map<String, SymbolToken> SYSTEM_TOKEN_MAP;

    static {
        String str = SystemSymbols.ION;
        int i = 1;
        List<SymbolToken> unmodifiableList = Collections.unmodifiableList(Arrays.asList(symbol(SystemSymbols.ION, 1), symbol(SystemSymbols.ION_1_0, 2), symbol(SystemSymbols.ION_SYMBOL_TABLE, 3), symbol("name", 4), symbol("version", 5), symbol(SystemSymbols.IMPORTS, 6), symbol(SystemSymbols.SYMBOLS, 7), symbol(SystemSymbols.MAX_ID, 8), symbol(SystemSymbols.ION_SHARED_SYMBOL_TABLE, 9)));
        SYSTEM_TOKENS = unmodifiableList;
        HashMap hashMap = new HashMap();
        for (SymbolToken symbolToken : unmodifiableList) {
            hashMap.put(symbolToken.getText(), symbolToken);
        }
        SYSTEM_TOKEN_MAP = Collections.unmodifiableMap(hashMap);
        SYSTEM_SYMBOL_TABLE = new AbstractSymbolTable(str, i) { // from class: com.amazon.ion.impl.bin.Symbols.3
            @Override // com.amazon.ion.SymbolTable
            public SymbolToken find(String str2) {
                return (SymbolToken) Symbols.SYSTEM_TOKEN_MAP.get(str2);
            }

            @Override // com.amazon.ion.SymbolTable
            public String findKnownSymbol(int i2) {
                if (i2 < 1) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "SID cannot be less than 1: "));
                    return null;
                }
                if (i2 > 9) {
                    return null;
                }
                return ((SymbolToken) Symbols.SYSTEM_TOKENS.get(i2 - 1)).getText();
            }

            @Override // com.amazon.ion.SymbolTable
            public int getImportedMaxId() {
                return 0;
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolTable[] getImportedTables() {
                return null;
            }

            @Override // com.amazon.ion.SymbolTable
            public int getMaxId() {
                return 9;
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolToken intern(String str2) {
                SymbolToken symbolToken2 = (SymbolToken) Symbols.SYSTEM_TOKEN_MAP.get(str2);
                if (symbolToken2 != null) {
                    return symbolToken2;
                }
                Classes$$ExternalSyntheticBUOutline0.m("Cannot intern new symbol into system symbol table");
                return null;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isLocalTable() {
                return false;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isReadOnly() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSharedTable() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSubstitute() {
                return false;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSystemTable() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public Iterator<String> iterateDeclaredSymbolNames() {
                return Symbols.symbolNameIterator(Symbols.SYSTEM_TOKENS.iterator());
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolTable getSystemSymbolTable() {
                return this;
            }
        };
    }

    private Symbols() {
    }

    public static SymbolToken symbol(final String str, final int i) {
        str.getClass();
        if (i > 0) {
            return new SymbolToken() { // from class: com.amazon.ion.impl.bin.Symbols.1
                @Override // com.amazon.ion.SymbolToken
                public String assumeText() {
                    return str;
                }

                @Override // com.amazon.ion.SymbolToken
                public int getSid() {
                    return i;
                }

                @Override // com.amazon.ion.SymbolToken
                public String getText() {
                    return str;
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("(symbol '");
                    sb.append(getText());
                    sb.append("' ");
                    return a$$ExternalSyntheticOutline0.m(sb, getSid(), MarkdownConstants.RIGHT_PARENTHESIS);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Symbol value must be positive: "));
        return null;
    }

    public static Iterator<String> symbolNameIterator(final Iterator<SymbolToken> it2) {
        return new Iterator<String>() { // from class: com.amazon.ion.impl.bin.Symbols.2
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            public String next() {
                return ((SymbolToken) it2.next()).getText();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static SymbolToken systemSymbol(int i) {
        if (i >= 1 && i <= 9) {
            return SYSTEM_TOKENS.get(i - 1);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "No such system SID: "));
        return null;
    }

    public static SymbolTable systemSymbolTable() {
        return SYSTEM_SYMBOL_TABLE;
    }

    public static Collection<SymbolToken> systemSymbols() {
        return SYSTEM_TOKENS;
    }

    public static SymbolTable unknownSharedSymbolTable(final String str, final int i, final int i2) {
        return new AbstractSymbolTable(str, i) { // from class: com.amazon.ion.impl.bin.Symbols.4
            @Override // com.amazon.ion.SymbolTable
            public SymbolToken find(String str2) {
                return null;
            }

            @Override // com.amazon.ion.SymbolTable
            public String findKnownSymbol(int i3) {
                return null;
            }

            @Override // com.amazon.ion.SymbolTable
            public int getImportedMaxId() {
                return 0;
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolTable[] getImportedTables() {
                return null;
            }

            @Override // com.amazon.ion.SymbolTable
            public int getMaxId() {
                return i2;
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolTable getSystemSymbolTable() {
                return Symbols.systemSymbolTable();
            }

            @Override // com.amazon.ion.SymbolTable
            public SymbolToken intern(String str2) {
                throw new UnsupportedOperationException("Cannot intern into substitute unknown shared symbol table: " + str + " version " + i);
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isLocalTable() {
                return false;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isReadOnly() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSharedTable() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSubstitute() {
                return true;
            }

            @Override // com.amazon.ion.SymbolTable
            public boolean isSystemTable() {
                return false;
            }

            @Override // com.amazon.ion.SymbolTable
            public Iterator<String> iterateDeclaredSymbolNames() {
                return new Iterator<String>() { // from class: com.amazon.ion.impl.bin.Symbols.4.1
                    int id = 1;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.id <= i2;
                    }

                    @Override // java.util.Iterator
                    public String next() {
                        if (hasNext()) {
                            this.id++;
                            return null;
                        }
                        Single$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
