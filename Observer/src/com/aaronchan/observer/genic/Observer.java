package com.aaronchan.observer.genic;

public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
	void update(S subject, A argument);
}
