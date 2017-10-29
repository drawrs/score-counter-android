// Generated code from Butter Knife. Do not modify!
package com.khilman.www.scorecounter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427422;

  private View view2131427423;

  private View view2131427426;

  private View view2131427427;

  private View view2131427428;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.team_a, "field 'teamA' and method 'onTeamAClicked'");
    target.teamA = Utils.castView(view, R.id.team_a, "field 'teamA'", TextView.class);
    view2131427422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTeamAClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.team_b, "field 'teamB' and method 'onTeamBClicked'");
    target.teamB = Utils.castView(view, R.id.team_b, "field 'teamB'", TextView.class);
    view2131427423 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTeamBClicked();
      }
    });
    target.scoreA = Utils.findRequiredViewAsType(source, R.id.score_a, "field 'scoreA'", TextView.class);
    target.scoreB = Utils.findRequiredViewAsType(source, R.id.score_b, "field 'scoreB'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_add_score_a, "field 'btnAddScoreA' and method 'onBtnAddScoreAClicked'");
    target.btnAddScoreA = Utils.castView(view, R.id.btn_add_score_a, "field 'btnAddScoreA'", Button.class);
    view2131427426 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBtnAddScoreAClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_add_score_b, "field 'btnAddScoreB' and method 'onBtnAddScoreBClicked'");
    target.btnAddScoreB = Utils.castView(view, R.id.btn_add_score_b, "field 'btnAddScoreB'", Button.class);
    view2131427427 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBtnAddScoreBClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_finish, "field 'btnFinish' and method 'onBtnFinishClicked'");
    target.btnFinish = Utils.castView(view, R.id.btn_finish, "field 'btnFinish'", Button.class);
    view2131427428 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBtnFinishClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.teamA = null;
    target.teamB = null;
    target.scoreA = null;
    target.scoreB = null;
    target.btnAddScoreA = null;
    target.btnAddScoreB = null;
    target.btnFinish = null;

    view2131427422.setOnClickListener(null);
    view2131427422 = null;
    view2131427423.setOnClickListener(null);
    view2131427423 = null;
    view2131427426.setOnClickListener(null);
    view2131427426 = null;
    view2131427427.setOnClickListener(null);
    view2131427427 = null;
    view2131427428.setOnClickListener(null);
    view2131427428 = null;
  }
}
