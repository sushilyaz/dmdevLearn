package com.suhoi.stringlesson;

import java.util.Objects;

public class StringObject {

    private String a;
    private String b;
    private String c;

    public StringObject(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringObject that = (StringObject) o;
        return Objects.equals(a, that.a) && Objects.equals(b, that.b) && Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
