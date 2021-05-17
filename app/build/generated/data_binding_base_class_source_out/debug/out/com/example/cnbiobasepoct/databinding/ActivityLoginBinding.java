// Generated by view binder compiler. Do not edit!
package com.example.cnbiobasepoct.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.cnbiobasepoct.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button dummyButton;

  @NonNull
  public final TextView fullscreenContent;

  @NonNull
  public final LinearLayout fullscreenContentControls;

  private ActivityLoginBinding(@NonNull FrameLayout rootView, @NonNull Button dummyButton,
      @NonNull TextView fullscreenContent, @NonNull LinearLayout fullscreenContentControls) {
    this.rootView = rootView;
    this.dummyButton = dummyButton;
    this.fullscreenContent = fullscreenContent;
    this.fullscreenContentControls = fullscreenContentControls;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dummy_button;
      Button dummyButton = rootView.findViewById(id);
      if (dummyButton == null) {
        break missingId;
      }

      id = R.id.fullscreen_content;
      TextView fullscreenContent = rootView.findViewById(id);
      if (fullscreenContent == null) {
        break missingId;
      }

      id = R.id.fullscreen_content_controls;
      LinearLayout fullscreenContentControls = rootView.findViewById(id);
      if (fullscreenContentControls == null) {
        break missingId;
      }

      return new ActivityLoginBinding((FrameLayout) rootView, dummyButton, fullscreenContent,
          fullscreenContentControls);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
