package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class MediaStream {
    private Direction direction;
    private Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Direction {
        RECVONLY,
        SENDRECV,
        SENDONLY,
        INACTIVE,
        OFF
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaStreamBuilder {
        private Direction direction;
        private Type type;

        public MediaStream build() {
            return new MediaStream(this.type, this.direction, 0);
        }

        public MediaStreamBuilder direction(Direction direction) {
            this.direction = direction;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MediaStream.MediaStreamBuilder(type=", String.valueOf(this.type), ", direction=", String.valueOf(this.direction), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public MediaStreamBuilder type(Type type) {
            this.type = type;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        AUDIO,
        VIDEO,
        TEXT
    }

    private MediaStream(Type type, Direction direction) {
        this.type = type;
        this.direction = direction;
    }

    public static MediaStreamBuilder builder() {
        return new MediaStreamBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MediaStream;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaStream)) {
            return false;
        }
        MediaStream mediaStream = (MediaStream) obj;
        if (!mediaStream.canEqual(this)) {
            return false;
        }
        Type type = getType();
        Type type2 = mediaStream.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Direction direction = getDirection();
        Direction direction2 = mediaStream.getDirection();
        return direction != null ? direction.equals(direction2) : direction2 == null;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        Direction direction = getDirection();
        return ((hashCode + 59) * 59) + (direction != null ? direction.hashCode() : 43);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("MediaStream(type=", String.valueOf(getType()), ", direction=", String.valueOf(getDirection()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public MediaStream() {
    }

    public /* synthetic */ MediaStream(Type type, Direction direction, int i) {
        this(type, direction);
    }
}
