package jbfx;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by miller5157r on 5/3/2017.
 */
public class KeyStates {
    private Map<KeyCode,Boolean> keysPressed = new HashMap<>();
    public KeyStates()
    {
        for(KeyCode code:KeyCode.values())
        {
            keysPressed.put(code,false);
        }
    }
    public void keyPressed(KeyCode code)
    {
        keysPressed.put(code,true);
    }
    public void keyReleased(KeyCode code)
    {
        keysPressed.put(code,false);
    }
    public boolean isKeyPressed(KeyCode code)
    {
        return keysPressed.get(code);
    }
}