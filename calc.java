<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/linearLayout"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:orientation="vertical"
        android:weightSum="2"
        app:layout_constraintBottom_toTopOf="@+id/linearLayout2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <TextView
            android:id="@+id/data"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:text="10+10"
            android:gravity="end|bottom"
            android:textColor="@color/colorWhite"
            android:background="#1D1D1D"
            android:textSize="40sp"/>

        <TextView
            android:id="@+id/output"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:text="20"
            android:gravity="end|center"
            android:textColor="@color/colorWhite"
            android:background="#1D1D1D"
            android:textSize="40sp"/>
    </LinearLayout>

    <LinearLayout
        android:id="@+id/linearLayout2"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:orientation="vertical"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/addorsub"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="+/-"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/brackets"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="()"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/percentage"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="%"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/division"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="/"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_operations"/>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/number7"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="7"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number8"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="8"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number9"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="9"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/multiplication"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="x"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_operations"/>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/number4"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="4"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number5"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="5"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number6"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="6"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/subtraction"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="-"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_operations"/>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/number1"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="1"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number2"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="2"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number3"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="3"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/addition"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="+"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_operations"/>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/clear"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="C"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/number0"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="0"
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/dot"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="."
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_numbers"/>

            <Button
                android:id="@+id/equal"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="="
                android:textSize="30sp"
                android:textColor="@color/colorWhite"
                android:background="@drawable/ripple_effect_operations"/>
        </LinearLayout>
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
