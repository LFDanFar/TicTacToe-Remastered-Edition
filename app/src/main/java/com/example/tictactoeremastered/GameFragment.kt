package com.example.tictactoeremastered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_game.view.*


private const val TAG = "GameFragment"
private const val KEY_INDEX = "index"

class GameFragment : Fragment() {

    private val tViewModel: TTTViewModel by lazy{
        ViewModelProviders.of(this).get(TTTViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        val butt1 = view.findViewById(R.id.button1) as Button
        val butt2 = view.findViewById(R.id.button2) as Button
        val butt3 = view.findViewById(R.id.button3) as Button
        val butt4 = view.findViewById(R.id.button4) as Button
        val butt5 = view.findViewById(R.id.button5) as Button
        val butt6 = view.findViewById(R.id.button6) as Button
        val butt7 = view.findViewById(R.id.button7) as Button
        val butt8 = view.findViewById(R.id.button8) as Button
        val butt9 = view.findViewById(R.id.button9) as Button
        val buttonReplay = view.findViewById(R.id.buttonPlayAgain) as Button
        val buttonShare = view.findViewById(R.id.buttonShareGame) as Button

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_game)

        val currentIndex = savedInstanceState?.getInt(KEY_INDEX, 0) ?: 0
        tViewModel.currentIndex = currentIndex

        var turn = 1
        var dootX = "X Wins!"
        var dootO = "O Wins!"
        var dootDraw = "It's a draw!"
        var b1 = 10
        var b2 = 20
        var b3 = 30
        var b4 = 40
        var b5 = 50
        var b6 = 60
        var b7 = 70
        var b8 = 80
        var b9 = 90

        /*val button1 = findViewById(R.id.button1) as Button
        val button2 = findViewById(R.id.button2) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button5 = findViewById(R.id.button5) as Button
        val button6 = findViewById(R.id.button6) as Button
        val button7 = findViewById(R.id.button7) as Button
        val button8 = findViewById(R.id.button8) as Button
        val button9 = findViewById(R.id.button9) as Button
        val buttonPlayAgain = findViewById(R.id.buttonPlayAgain) as Button*/

        button1.setOnClickListener{
            if (turn%2 == 1) {
                button1.text = "X"
                b1 = 1
            }
            else {
                button1.text = "O"
                b1 = 2
            }
            if(b1 == b2 && b1 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b1 == b4 && b1 == b7){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b1 == b5 && b1 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button1.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button2.setOnClickListener{
            if (turn%2 == 1) {
                button2.text = "X"
                b2 = 1
            }
            else {
                button2.text = "O"
                b2 = 2
            }
            if(b1 == b2 && b1 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b2 == b5 && b5 == b8){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button2.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button3.setOnClickListener{
            if (turn%2 == 1) {
                button3.text = "X"
                b3 = 1
            }
            else {
                button3.text = "O"
                b3 = 2
            }
            if(b1 == b2 && b1 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button3.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button4.setOnClickListener{
            if (turn%2 == 1) {
                button4.text = "X"
                b4 = 1
            }
            else {
                button4.text = "O"
                b4 = 2
            }
            if(b1 == b4 && b1 == b7){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()            }
            turn += 1
            button4.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button5.setOnClickListener{
            if (turn%2 == 1) {
                button5.text = "X"
                b5 = 1
            }
            else {
                button5.text = "O"
                b5 = 2
            }
            if(b1 == b5 && b1 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b2 == b5 && b2 == b8){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button5.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button6.setOnClickListener{
            if (turn%2 == 1) {
                button6.text = "X"
                b6 = 1
            }
            else {
                button6.text = "O"
                b6 = 2
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            button6.isClickable = false
            turn += 1
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button7.setOnClickListener{
            if (turn%2 == 1) {
                button7.text = "X"
                b7 = 1
            }
            else {
                button7.text = "O"
                b7 = 2
            }
            if(b1 == b4 && b1 == b7){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button7.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button8.setOnClickListener{
            if (turn%2 == 1) {
                button8.text = "X"
                b8 = 1
            }
            else {
                button8.text = "O"
                b8 = 2
            }
            if(b2 == b5 && b5 == b8){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button8.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        button9.setOnClickListener{
            if (turn%2 == 1) {
                button9.text = "X"
                b9 = 1
            }
            else {
                button9.text = "O"
                b9 = 2
            }
            if(b1 == b5 && b1 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()

                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false}
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1)
                    Toast.makeText(activity, "$dootX", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(activity, "$dootO", Toast.LENGTH_SHORT).show()
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
            }
            turn += 1
            button9.isClickable = false
            if (turn == 10){
                Toast.makeText(activity, "$dootDraw", Toast.LENGTH_SHORT).show()
            }
        }
        buttonPlayAgain.setOnClickListener{
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""

            button1.isClickable = true
            button2.isClickable = true
            button3.isClickable = true
            button4.isClickable = true
            button5.isClickable = true
            button6.isClickable = true
            button7.isClickable = true
            button8.isClickable = true
            button9.isClickable = true

            turn = 1
            b1 = 0
            b2 = b1
            b3 = b1
            b4 = b1
            b5 = b1
            b6 = b1
            b7 = b1
            b8 = b1
            b9 = b1
        }
    }


    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            savedInstanceState.putInt(KEY_INDEX, tViewModel.currentIndex)
        }
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart() called")
    }
}