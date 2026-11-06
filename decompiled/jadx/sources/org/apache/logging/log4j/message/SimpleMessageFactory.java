package org.apache.logging.log4j.message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class SimpleMessageFactory extends AbstractMessageFactory {
    public static final SimpleMessageFactory INSTANCE = new SimpleMessageFactory();
    private static final long serialVersionUID = 4418995198790088516L;

    @Override // org.apache.logging.log4j.message.MessageFactory
    public Message newMessage(String str, Object... objArr) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return new SimpleMessage(str);
    }

    @Override // org.apache.logging.log4j.message.AbstractMessageFactory, org.apache.logging.log4j.message.MessageFactory2
    public Message newMessage(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return new SimpleMessage(str);
    }
}
