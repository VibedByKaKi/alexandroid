package com.amazon.alexa.voice.ui.onedesign.movies.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int LINK = 3;
    private static final int POSTER = 2;
    private final List<Object> items = new ArrayList();
    private OnMovieLinkClickListener onMovieLinkClickListener;
    private OnMoviePosterClickListener onMoviePosterClickListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnMovieLinkClickListener {
        void onMovieLinkClicked(MoviesListLinkModel moviesListLinkModel);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnMoviePosterClickListener {
        void onMoviePosterClicked(MoviesListPosterModel moviesListPosterModel);
    }

    public void add(Object obj) {
        this.items.add(obj);
        notifyItemInserted(this.items.size() - 1);
    }

    public Object get(int i) {
        return this.items.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object obj = this.items.get(i);
        if (obj instanceof MoviesListPosterModel) {
            return 2;
        }
        if (obj instanceof MoviesListLinkModel) {
            return 3;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "Unknown type of an item "));
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 2) {
            ((MoviesListPosterViewHolder) viewHolder).bind((MoviesListPosterModel) this.items.get(i), this.onMoviePosterClickListener);
        } else {
            if (itemViewType != 3) {
                return;
            }
            ((MoviesListLinkViewHolder) viewHolder).bind((MoviesListLinkModel) this.items.get(i), this.onMovieLinkClickListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new MoviesListPosterViewHolder(from, viewGroup);
        }
        if (i == 3) {
            return new MoviesListLinkViewHolder(from, viewGroup);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i, "Unsupported viewType "));
        return null;
    }

    public void setOnMovieLinkClickListener(OnMovieLinkClickListener onMovieLinkClickListener) {
        this.onMovieLinkClickListener = onMovieLinkClickListener;
    }

    public void setOnMoviePosterClickListener(OnMoviePosterClickListener onMoviePosterClickListener) {
        this.onMoviePosterClickListener = onMoviePosterClickListener;
    }
}
