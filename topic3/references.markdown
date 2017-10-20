# INTRODUCTION TO MULTITHREADING 

**USEFUL DEFINITIONS TO UNDERSTAND REFERENCES**

+ Definition of Multiprocessing - taking advantage of cpu multiple cores, 2 process running concurrently like in different machines
+ [Blocking and non-blockin system call ](http://faculty.salina.k-state.edu/tim/ossg/Device/blocking.html)

**REFERENCES**

1. [Difference between Multiprogramming, Multitasking, Multithreading and Multiprocessing](
http://www.8bitavenue.com/2012/10/difference-between-multiprogramming-multitasking-multithreading-and-multiprocessing/)
2. [Difference between user level threads and Kernel Level threads](http://www.8bitavenue.com/2015/07/difference-between-user-level-threads-and-kernel-level-threads/)
    + User level threads are handled by an applicaton library - can't run concurrently, very lightweight in regards to memory, contex switch without high overhead If however blocking system call is called which blocks the all process, this does not work well
    + Kernel level threads are handled by the kernel (exactly like processes, but in a different table) can take advantage of multiprocessing, need more memory , context switch is expensive.
3. [Comparison as table](http://www.geeksforgeeks.org/operating-system-user-level-thread-vs-kernel-level-thread/)
4. [Thread memory sharing](https://stackoverflow.com/questions/41632073/do-threads-share-local-variables)
5. [Process memory distribution](https://gabrieletolomei.wordpress.com/miscellanea/operating-systems/in-memory-layout/)




# MULTITHREADING IN PYTHON


**USEFUL DEFINITIONS TO UNDERSTAND REFERENCES**

+ Threading library does not allow multiprocessing, but Multiprocessing library does.
+ Threading context switch ligther - good if you dont have process blocking calls.

**REFERENCES***

1.[Threading vs Multiprocessing](https://www.quantstart.com/articles/Parallelising-Python-with-Threading-and-Multiprocessing)
2.[Same thing as in previous](https://stackoverflow.com/questions/4496680/python-threads-all-executing-on-a-single-core)
