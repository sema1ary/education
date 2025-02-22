package pattern.adapter;

public class MyTrack implements Track{
    @Override
    public void clean() {
        System.out.println("clean");
    }
}
