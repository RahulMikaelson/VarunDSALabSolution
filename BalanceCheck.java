package GreatLearning_Lab3_Question1;

import java.util.Stack;

public class BalanceCheck {
	public boolean balanceChecking(String str) {
		if (str.length()%2 ==1){
			return false;
		}
		else {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
				continue;
			}
			if (st.isEmpty())
				return false;
			char c;
			switch (ch) {
			case ')':
				 c = st.pop();
				if (c == '{' || c == '[')
					return false;
				break;

			case '}':
				c = st.pop();
				if (c == '(' || c == '[')
					return false;
				break;

			case ']':
				c = st.pop();
				if (c == '{' || c == '(')
					return false;
				break;
			}
		}
		
		return st.isEmpty();
		}
	}

}
