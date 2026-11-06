package com.amazon.dee.app.config;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u009b\u0001\n\u0002\u0010\u000b\n\u0002\br\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0012\u0010\"\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0012\u0010$\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u0012\u0010,\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0005R\u0012\u0010.\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0012\u00100\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0005R\u0012\u00104\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0012\u00106\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0012\u00108\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005R\u0012\u0010:\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0005R\u0012\u0010<\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u0012\u0010>\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0012\u0010@\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0005R\u0012\u0010B\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005R\u0012\u0010D\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0005R\u0012\u0010F\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0012\u0010H\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0012\u0010J\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0012\u0010L\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0012\u0010N\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0012\u0010P\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0012\u0010R\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0005R\u0012\u0010T\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0005R\u0012\u0010V\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0005R\u0012\u0010X\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0005R\u0012\u0010Z\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0005R\u0012\u0010\\\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0005R\u0012\u0010^\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0005R\u0012\u0010`\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0005R\u0012\u0010b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0005R\u0012\u0010d\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0005R\u0012\u0010f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0012\u0010h\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0012\u0010j\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0012\u0010l\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0012\u0010n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0012\u0010p\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0012\u0010r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0005R\u0012\u0010t\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0005R\u0012\u0010v\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u0005R\u0012\u0010x\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0005R\u0012\u0010z\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0005R\u0012\u0010|\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0005R\u0012\u0010~\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0005R\u0014\u0010\u0080\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0005R\u0014\u0010\u0082\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0005R\u0014\u0010\u0084\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0005R\u0014\u0010\u0086\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0005R\u0014\u0010\u0088\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0005R\u0014\u0010\u008a\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0005R\u0014\u0010\u008c\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0005R\u0014\u0010\u008e\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0005R\u0014\u0010\u0090\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0005R\u0014\u0010\u0092\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0005R\u0014\u0010\u0094\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0005R\u0014\u0010\u0096\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0005R\u0014\u0010\u0098\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0005R\u0014\u0010\u009a\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0005R\u0014\u0010\u009c\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0005R\u0016\u0010\u009e\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010 \u0001R\u0016\u0010¡\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010 \u0001R\u0016\u0010¢\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010 \u0001R\u0016\u0010£\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010 \u0001R\u0016\u0010¤\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010 \u0001R\u0016\u0010¥\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010 \u0001R\u0016\u0010¦\u0001\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010 \u0001R\u0014\u0010§\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0005R\u0014\u0010©\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0005R\u0014\u0010«\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0005R\u0014\u0010\u00ad\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0005R\u0014\u0010¯\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\u0005R\u0014\u0010±\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\u0005R\u0014\u0010³\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0005R\u0014\u0010µ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u0005R\u0014\u0010·\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0005R\u0014\u0010¹\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u0005R\u0014\u0010»\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u0005R\u0014\u0010½\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u0005R\u0014\u0010¿\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\u0005R\u0014\u0010Á\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\u0005R\u0014\u0010Ã\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\u0005R\u0014\u0010Å\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0005R\u0014\u0010Ç\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\u0005R\u0014\u0010É\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\u0005R\u0014\u0010Ë\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\u0005R\u0014\u0010Í\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\u0005R\u0014\u0010Ï\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u0005R\u0014\u0010Ñ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u0005R\u0014\u0010Ó\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u0005R\u0014\u0010Õ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u0005R\u0014\u0010×\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0005R\u0014\u0010Ù\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u0005R\u0014\u0010Û\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u0005R\u0014\u0010Ý\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0001\u0010\u0005R\u0014\u0010ß\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bà\u0001\u0010\u0005R\u0014\u0010á\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010\u0005R\u0014\u0010ã\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u0005R\u0014\u0010å\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\u0005R\u0014\u0010ç\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\u0005R\u0014\u0010é\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\u0005R\u0014\u0010ë\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u0005R\u0014\u0010í\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u0010\u0005R\u0014\u0010ï\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bð\u0001\u0010\u0005R\u0014\u0010ñ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bò\u0001\u0010\u0005R\u0014\u0010ó\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010\u0005R\u0014\u0010õ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bö\u0001\u0010\u0005R\u0014\u0010÷\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010\u0005R\u0014\u0010ù\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bú\u0001\u0010\u0005R\u0014\u0010û\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010\u0005R\u0014\u0010ý\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010\u0005R\u0014\u0010ÿ\u0001\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010\u0005R\u0014\u0010\u0081\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\u0005R\u0014\u0010\u0083\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010\u0005R\u0014\u0010\u0085\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0002\u0010\u0005R\u0014\u0010\u0087\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0002\u0010\u0005R\u0014\u0010\u0089\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u0010\u0005R\u0014\u0010\u008b\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0002\u0010\u0005R\u0016\u0010\u008d\u0002\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0002\u0010 \u0001R\u0016\u0010\u008e\u0002\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010 \u0001R\u0016\u0010\u008f\u0002\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010 \u0001R\u0016\u0010\u0090\u0002\u001a\u00030\u009f\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010 \u0001¨\u0006\u0091\u0002À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/config/AppEnvironmentConfig;", "", "host", "", "getHost", "()Ljava/lang/String;", "hostAu", "getHostAu", "hostBr", "getHostBr", "hostCa", "getHostCa", "hostCn", "getHostCn", "hostDe", "getHostDe", "hostEs", "getHostEs", "hostFr", "getHostFr", "hostId", "getHostId", "hostIn", "getHostIn", "hostIt", "getHostIt", "hostJp", "getHostJp", "hostMx", "getHostMx", "hostNl", "getHostNl", "hostRu", "getHostRu", "hostUk", "getHostUk", "authHost", "getAuthHost", "authHostAu", "getAuthHostAu", "authHostBr", "getAuthHostBr", "authHostCa", "getAuthHostCa", "authHostCn", "getAuthHostCn", "authHostDe", "getAuthHostDe", "authHostEs", "getAuthHostEs", "authHostFr", "getAuthHostFr", "authHostId", "getAuthHostId", "authHostIn", "getAuthHostIn", "authHostIt", "getAuthHostIt", "authHostJp", "getAuthHostJp", "authHostMx", "getAuthHostMx", "authHostNl", "getAuthHostNl", "authHostRu", "getAuthHostRu", "authHostUk", "getAuthHostUk", "apiGatewayHost", "getApiGatewayHost", "apiGatewayHostAu", "getApiGatewayHostAu", "apiGatewayHostBr", "getApiGatewayHostBr", "apiGatewayHostCa", "getApiGatewayHostCa", "apiGatewayHostCn", "getApiGatewayHostCn", "apiGatewayHostDe", "getApiGatewayHostDe", "apiGatewayHostEs", "getApiGatewayHostEs", "apiGatewayHostFr", "getApiGatewayHostFr", "apiGatewayHostId", "getApiGatewayHostId", "apiGatewayHostIn", "getApiGatewayHostIn", "apiGatewayHostIt", "getApiGatewayHostIt", "apiGatewayHostJp", "getApiGatewayHostJp", "apiGatewayHostMx", "getApiGatewayHostMx", "apiGatewayHostNl", "getApiGatewayHostNl", "apiGatewayHostRu", "getApiGatewayHostRu", "apiGatewayHostUk", "getApiGatewayHostUk", "skillsStoreEndpoint", "getSkillsStoreEndpoint", "skillsStoreEndpointAu", "getSkillsStoreEndpointAu", "skillsStoreEndpointBr", "getSkillsStoreEndpointBr", "skillsStoreEndpointCa", "getSkillsStoreEndpointCa", "skillsStoreEndpointCn", "getSkillsStoreEndpointCn", "skillsStoreEndpointDe", "getSkillsStoreEndpointDe", "skillsStoreEndpointEs", "getSkillsStoreEndpointEs", "skillsStoreEndpointFr", "getSkillsStoreEndpointFr", "skillsStoreEndpointIn", "getSkillsStoreEndpointIn", "skillsStoreEndpointIt", "getSkillsStoreEndpointIt", "skillsStoreEndpointJp", "getSkillsStoreEndpointJp", "skillsStoreEndpointMx", "getSkillsStoreEndpointMx", "skillsStoreEndpointNl", "getSkillsStoreEndpointNl", "skillsStoreEndpointUk", "getSkillsStoreEndpointUk", "bobHost", "getBobHost", "bobHostAu", "getBobHostAu", "bobHostBr", "getBobHostBr", "bobHostCa", "getBobHostCa", "bobHostCn", "getBobHostCn", "bobHostDe", "getBobHostDe", "bobHostEs", "getBobHostEs", "bobHostFr", "getBobHostFr", "bobHostIn", "getBobHostIn", "bobHostIt", "getBobHostIt", "bobHostJp", "getBobHostJp", "bobHostMx", "getBobHostMx", "bobHostNl", "getBobHostNl", "bobHostUk", "getBobHostUk", "stage", "getStage", "isLocalEnvironment", "", "()Z", "isAlphaEnvironment", "isBetaEnvironment", "isGammaEnvironment", "isPreProdEnvironment", "isProdEnvironment", "isPerformanceEnvironment", "deviceType", "getDeviceType", "fcmSenderId", "getFcmSenderId", "authAssociationHandle", "getAuthAssociationHandle", "authAssociationHandleAu", "getAuthAssociationHandleAu", "authAssociationHandleBr", "getAuthAssociationHandleBr", "authAssociationHandleCa", "getAuthAssociationHandleCa", "authAssociationHandleCn", "getAuthAssociationHandleCn", "authAssociationHandleDe", "getAuthAssociationHandleDe", "authAssociationHandleEs", "getAuthAssociationHandleEs", "authAssociationHandleFr", "getAuthAssociationHandleFr", "authAssociationHandleId", "getAuthAssociationHandleId", "authAssociationHandleIn", "getAuthAssociationHandleIn", "authAssociationHandleIt", "getAuthAssociationHandleIt", "authAssociationHandleJp", "getAuthAssociationHandleJp", "authAssociationHandleMx", "getAuthAssociationHandleMx", "authAssociationHandleNl", "getAuthAssociationHandleNl", "authAssociationHandleRu", "getAuthAssociationHandleRu", "authAssociationHandleUk", "getAuthAssociationHandleUk", "retailHost", "getRetailHost", "retailHostAu", "getRetailHostAu", "retailHostBr", "getRetailHostBr", "retailHostCa", "getRetailHostCa", "retailHostCn", "getRetailHostCn", "retailHostDe", "getRetailHostDe", "retailHostEs", "getRetailHostEs", "retailHostFr", "getRetailHostFr", "retailHostId", "getRetailHostId", "retailHostIn", "getRetailHostIn", "retailHostIt", "getRetailHostIt", "retailHostJp", "getRetailHostJp", "retailHostMx", "getRetailHostMx", "retailHostNl", "getRetailHostNl", "retailHostRu", "getRetailHostRu", "retailHostUk", "getRetailHostUk", "voiceHost", "getVoiceHost", "metricsAwsAppId", "getMetricsAwsAppId", "metricsAwsIdentityPoolId", "getMetricsAwsIdentityPoolId", "metricsAwsKinesisStreamName", "getMetricsAwsKinesisStreamName", "metricsAwsKinesisCognitoIdentityPoolId", "getMetricsAwsKinesisCognitoIdentityPoolId", "metricsAwsKinesisRegion", "getMetricsAwsKinesisRegion", "metricsMobilyticsStreamName", "getMetricsMobilyticsStreamName", "metricsMobilyticsDefaultRegion", "getMetricsMobilyticsDefaultRegion", "metricsMobilyticsCognitoIdentityPoolId", "getMetricsMobilyticsCognitoIdentityPoolId", "metricsMobilyticsCognitoIdentityPoolIdUsEast1", "getMetricsMobilyticsCognitoIdentityPoolIdUsEast1", "metricsMobilyticsCognitoIdentityPoolIdUsWest2", "getMetricsMobilyticsCognitoIdentityPoolIdUsWest2", "metricsMobilyticsCognitoIdentityPoolIdEuWest1", "getMetricsMobilyticsCognitoIdentityPoolIdEuWest1", "cloudDriveServiceMetadataEndpoint", "getCloudDriveServiceMetadataEndpoint", "cloudDriveServiceContentEndpoint", "getCloudDriveServiceContentEndpoint", "cloudDriveServiceGroupEndpoint", "getCloudDriveServiceGroupEndpoint", "bugsnagApiKey", "getBugsnagApiKey", "appIdHeader", "getAppIdHeader", "isCommsFriendsAndFamilyEnabled", "isRnTurboModuleEnabled", "isRnFabricEnabled", "isRnBridgelessEnabled", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AppEnvironmentConfig {
    @NotNull
    String getApiGatewayHost();

    @NotNull
    String getApiGatewayHostAu();

    @NotNull
    String getApiGatewayHostBr();

    @NotNull
    String getApiGatewayHostCa();

    @NotNull
    String getApiGatewayHostCn();

    @NotNull
    String getApiGatewayHostDe();

    @NotNull
    String getApiGatewayHostEs();

    @NotNull
    String getApiGatewayHostFr();

    @NotNull
    String getApiGatewayHostId();

    @NotNull
    String getApiGatewayHostIn();

    @NotNull
    String getApiGatewayHostIt();

    @NotNull
    String getApiGatewayHostJp();

    @NotNull
    String getApiGatewayHostMx();

    @NotNull
    String getApiGatewayHostNl();

    @NotNull
    String getApiGatewayHostRu();

    @NotNull
    String getApiGatewayHostUk();

    @NotNull
    String getAppIdHeader();

    @NotNull
    String getAuthAssociationHandle();

    @NotNull
    String getAuthAssociationHandleAu();

    @NotNull
    String getAuthAssociationHandleBr();

    @NotNull
    String getAuthAssociationHandleCa();

    @NotNull
    String getAuthAssociationHandleCn();

    @NotNull
    String getAuthAssociationHandleDe();

    @NotNull
    String getAuthAssociationHandleEs();

    @NotNull
    String getAuthAssociationHandleFr();

    @NotNull
    String getAuthAssociationHandleId();

    @NotNull
    String getAuthAssociationHandleIn();

    @NotNull
    String getAuthAssociationHandleIt();

    @NotNull
    String getAuthAssociationHandleJp();

    @NotNull
    String getAuthAssociationHandleMx();

    @NotNull
    String getAuthAssociationHandleNl();

    @NotNull
    String getAuthAssociationHandleRu();

    @NotNull
    String getAuthAssociationHandleUk();

    @NotNull
    String getAuthHost();

    @NotNull
    String getAuthHostAu();

    @NotNull
    String getAuthHostBr();

    @NotNull
    String getAuthHostCa();

    @NotNull
    String getAuthHostCn();

    @NotNull
    String getAuthHostDe();

    @NotNull
    String getAuthHostEs();

    @NotNull
    String getAuthHostFr();

    @NotNull
    String getAuthHostId();

    @NotNull
    String getAuthHostIn();

    @NotNull
    String getAuthHostIt();

    @NotNull
    String getAuthHostJp();

    @NotNull
    String getAuthHostMx();

    @NotNull
    String getAuthHostNl();

    @NotNull
    String getAuthHostRu();

    @NotNull
    String getAuthHostUk();

    @NotNull
    String getBobHost();

    @NotNull
    String getBobHostAu();

    @NotNull
    String getBobHostBr();

    @NotNull
    String getBobHostCa();

    @NotNull
    String getBobHostCn();

    @NotNull
    String getBobHostDe();

    @NotNull
    String getBobHostEs();

    @NotNull
    String getBobHostFr();

    @NotNull
    String getBobHostIn();

    @NotNull
    String getBobHostIt();

    @NotNull
    String getBobHostJp();

    @NotNull
    String getBobHostMx();

    @NotNull
    String getBobHostNl();

    @NotNull
    String getBobHostUk();

    @NotNull
    String getBugsnagApiKey();

    @NotNull
    String getCloudDriveServiceContentEndpoint();

    @NotNull
    String getCloudDriveServiceGroupEndpoint();

    @NotNull
    String getCloudDriveServiceMetadataEndpoint();

    @NotNull
    String getDeviceType();

    @NotNull
    String getFcmSenderId();

    @NotNull
    String getHost();

    @NotNull
    String getHostAu();

    @NotNull
    String getHostBr();

    @NotNull
    String getHostCa();

    @NotNull
    String getHostCn();

    @NotNull
    String getHostDe();

    @NotNull
    String getHostEs();

    @NotNull
    String getHostFr();

    @NotNull
    String getHostId();

    @NotNull
    String getHostIn();

    @NotNull
    String getHostIt();

    @NotNull
    String getHostJp();

    @NotNull
    String getHostMx();

    @NotNull
    String getHostNl();

    @NotNull
    String getHostRu();

    @NotNull
    String getHostUk();

    @NotNull
    String getMetricsAwsAppId();

    @NotNull
    String getMetricsAwsIdentityPoolId();

    @NotNull
    String getMetricsAwsKinesisCognitoIdentityPoolId();

    @NotNull
    String getMetricsAwsKinesisRegion();

    @NotNull
    String getMetricsAwsKinesisStreamName();

    @NotNull
    String getMetricsMobilyticsCognitoIdentityPoolId();

    @NotNull
    String getMetricsMobilyticsCognitoIdentityPoolIdEuWest1();

    @NotNull
    String getMetricsMobilyticsCognitoIdentityPoolIdUsEast1();

    @NotNull
    String getMetricsMobilyticsCognitoIdentityPoolIdUsWest2();

    @NotNull
    String getMetricsMobilyticsDefaultRegion();

    @NotNull
    String getMetricsMobilyticsStreamName();

    @NotNull
    String getRetailHost();

    @NotNull
    String getRetailHostAu();

    @NotNull
    String getRetailHostBr();

    @NotNull
    String getRetailHostCa();

    @NotNull
    String getRetailHostCn();

    @NotNull
    String getRetailHostDe();

    @NotNull
    String getRetailHostEs();

    @NotNull
    String getRetailHostFr();

    @NotNull
    String getRetailHostId();

    @NotNull
    String getRetailHostIn();

    @NotNull
    String getRetailHostIt();

    @NotNull
    String getRetailHostJp();

    @NotNull
    String getRetailHostMx();

    @NotNull
    String getRetailHostNl();

    @NotNull
    String getRetailHostRu();

    @NotNull
    String getRetailHostUk();

    @NotNull
    String getSkillsStoreEndpoint();

    @NotNull
    String getSkillsStoreEndpointAu();

    @NotNull
    String getSkillsStoreEndpointBr();

    @NotNull
    String getSkillsStoreEndpointCa();

    @NotNull
    String getSkillsStoreEndpointCn();

    @NotNull
    String getSkillsStoreEndpointDe();

    @NotNull
    String getSkillsStoreEndpointEs();

    @NotNull
    String getSkillsStoreEndpointFr();

    @NotNull
    String getSkillsStoreEndpointIn();

    @NotNull
    String getSkillsStoreEndpointIt();

    @NotNull
    String getSkillsStoreEndpointJp();

    @NotNull
    String getSkillsStoreEndpointMx();

    @NotNull
    String getSkillsStoreEndpointNl();

    @NotNull
    String getSkillsStoreEndpointUk();

    @NotNull
    String getStage();

    @NotNull
    String getVoiceHost();

    boolean isAlphaEnvironment();

    boolean isBetaEnvironment();

    boolean isCommsFriendsAndFamilyEnabled();

    boolean isGammaEnvironment();

    boolean isLocalEnvironment();

    boolean isPerformanceEnvironment();

    boolean isPreProdEnvironment();

    boolean isProdEnvironment();

    boolean isRnBridgelessEnabled();

    boolean isRnFabricEnabled();

    boolean isRnTurboModuleEnabled();
}
