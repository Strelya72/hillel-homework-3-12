package main.java.lesson7;

import java.util.NoSuchElementException;

public class MyOptional<T> {
    private T data;

    private MyOptional(T data) {
        this.data = data;
    }

    public T get() {
        if (!isPresent()) {
            throw new NoSuchElementException("Get null data");
        }
        return data;
    }

    public boolean isPresent() {
        return data != null;
    }

    public static <U> MyOptional<U> of(U data) {
        if (data == null) {
            throw new NullPointerException("Null in Of method");
        }
        return new MyOptional<U>(data);
    }

    public static <U> MyOptional<U> ofNullable(U data) {
        return new MyOptional<U>(data);
    }

    public static <U> MyOptional<U> empty() {
        return new MyOptional<U>(null);
    }

    public T orElse(T other) {
        return isPresent() ? data : other;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof MyOptional)) {
            return false;
        }
        MyOptional<?> other = (MyOptional<?>) object;

        if (this.isPresent() != other.isPresent()) {
            return false;
        }
        if (!this.isPresent() && !other.isPresent()) {
            return true;
        }
        
        return this.get().equals(other.get());
    }
}
