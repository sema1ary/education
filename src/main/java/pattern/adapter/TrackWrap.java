package pattern.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TrackWrap implements Car{
    private final Track track;

    @Override
    public void wash() {
        track.clean();
    }
}
