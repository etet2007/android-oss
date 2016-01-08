package com.kickstarter.ui.viewholders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.kickstarter.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public final class LoggedInMenuViewHolder {
  @Bind(R.id.menu_item_title) TextView menuItemTitleTextView;

  public LoggedInMenuViewHolder(final @NonNull View view, final @NonNull String title) {
    ButterKnife.bind(this, view);

    menuItemTitleTextView.setText(title);
    menuItemTitleTextView.setContentDescription(title);
  }
}