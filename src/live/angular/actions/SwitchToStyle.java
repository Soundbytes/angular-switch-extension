package live.angular.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import live.angular.utils.ExtensionSwitcher;
import org.jetbrains.annotations.NotNull;

public class SwitchToStyle extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        new ExtensionSwitcher(e).switchToStyle();
    }
}
