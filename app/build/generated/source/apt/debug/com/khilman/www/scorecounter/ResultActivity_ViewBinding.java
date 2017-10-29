// Generated code from Butter Knife. Do not modify!
package com.khilman.www.scorecounter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultActivity_ViewBinding implements Unbinder {
  private ResultActivity target;

  @UiThread
  public ResultActivity_ViewBinding(ResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ResultActivity_ViewBinding(ResultActivity target, View source) {
    this.target = target;

    target.winnerTeam = Utils.findRequiredViewAsType(source, R.id.winner_team, "field 'winnerTeam'", TextView.class);
    target.teamA = Utils.findRequiredViewAsType(source, R.id.team_a, "field 'teamA'", TextView.class);
    target.teamB = Utils.findRequiredViewAsType(source, R.id.team_b, "field 'teamB'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.winnerTeam = null;
    target.teamA = null;
    target.teamB = null;
  }
}
