// 챕터 11의 패키지
package p01_11.chapter11;

// Box라는 class에서 Box를 제네릭으로 선언함.(public이기에 다른 클래스에서 공유 가능)
public class Box<T> {
    // private기에 해당 class에서만 사용가능/ 제네릭 안에 들어갈 T를 item이라는 이름으로 선언.
    private T item;
    // setItem을 public으로 선언했기에 다른class에서 공유가능
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}