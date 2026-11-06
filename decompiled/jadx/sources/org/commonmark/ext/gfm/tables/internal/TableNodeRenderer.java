package org.commonmark.ext.gfm.tables.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class TableNodeRenderer implements NodeRenderer {
    @Override // org.commonmark.renderer.NodeRenderer
    public Set<Class<? extends Node>> getNodeTypes() {
        return new HashSet(Arrays.asList(TableBlock.class, TableHead.class, TableBody.class, TableRow.class, TableCell.class));
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public void render(Node node) {
        if (node instanceof TableBlock) {
            renderBlock((TableBlock) node);
            return;
        }
        if (node instanceof TableHead) {
            renderHead((TableHead) node);
            return;
        }
        if (node instanceof TableBody) {
            renderBody((TableBody) node);
        } else if (node instanceof TableRow) {
            renderRow((TableRow) node);
        } else if (node instanceof TableCell) {
            renderCell((TableCell) node);
        }
    }

    public abstract void renderBlock(TableBlock tableBlock);

    public abstract void renderBody(TableBody tableBody);

    public abstract void renderCell(TableCell tableCell);

    public abstract void renderHead(TableHead tableHead);

    public abstract void renderRow(TableRow tableRow);
}
