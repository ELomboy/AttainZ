package com.prjucu.attainz;

public interface RecyclerViewAction {
    void onViewClicked(int clickedViewId, int clickedItemPosition);
    void onViewLongClicked(int clickedViewId, int clickedItemPosition);
}
