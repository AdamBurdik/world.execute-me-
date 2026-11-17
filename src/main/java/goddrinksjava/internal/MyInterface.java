package goddrinksjava.internal;

import com.raylib.Helpers;

import static com.raylib.Raylib.*;

public class MyInterface {
    private boolean ImAlive = true;

    private int WIDTH = 480 * 2;
    private int HEIGHT = 270 * 2;

    public void run() {
        InitWindow(WIDTH, HEIGHT, "world.execute(me)");
        SetTargetFPS(60);
        
        while (ImAlive && !WindowShouldClose()) {
            BeginDrawing();
            
            ClearBackground(Helpers.newColor(0, 0, 0, 255));
            
            int width = MeasureText("world.execute(me)", 64);
            DrawText("world.execute(me)", (WIDTH - width) / 2, (HEIGHT - 64) / 2, 64, Helpers.newColor(255, 255, 255, 255));
            
            EndDrawing();
        }
        
        CloseWindow();
    }
    
    public void removeYourRegrets() {
        
    }
    
    public void killMe() {
        this.ImAlive = false;
        for (int i = 0; i < 10; i++) {
            System.out.println(":(");
        }
        removeYourRegrets();
    }
}
