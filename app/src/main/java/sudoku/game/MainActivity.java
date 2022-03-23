package sudoku.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private SudokuBoard gameBoard;
    private Solver gameBoardSolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameBoard = findViewById(R.id.SudokuBoard);
        gameBoardSolver = gameBoard.getSolver();




    }
    public void BTNOnePress(View view)
    {
        gameBoardSolver.setNumberPos(1);
        gameBoard.invalidate();
    }



}