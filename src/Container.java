import java.util.NoSuchElementException;

public class Container<T> {
    private T data;


    private Container(T data) {
        this.data = data;
    }

    public boolean isPresent() {

        if (data != null) {
            return true;
        } else {
            return false;
        }
    }

    public T getData() {
        if (data == null) {
            throw new NoSuchElementException();
        } else {
            return data;
        }
    }

    public static <T> Container<T> of(T value) {
        if (value == null) {
            throw new NullPointerException();
        } else {
            return new Container<>(value);
        }
    }

    public <T> Container<T> ofNullable(T value) {
        return new Container<>(value);
    }

    public <T> Container<T> empty() {
        return new Container<>(null);
    }

    public T orElse(T other) {
        if (isPresent()) {
            return data;
        } else {
            return other;
        }
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Container)) {
            return false;
        }
        return result;
    }

    public int hashCode(T data) {
        int hashCode = hashCode(data);
        return hashCode;
    }
}
