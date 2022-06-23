package com.git.syntax.class01;

public class Intro {

	public static void main(String[] args) {
		/*
		 * What is Version?
		 * 	Any update in an application is referred to as a updated
		 * version.
		 * 
		 * Scenario1:
		 * 	1. A code that can perform *, /; -->Version 0 (v0)
		 * 
		 * Scenario2:
		 * 	1. A code that can perform *, /, +, -; -->Version 1 (v1)
		 * 
		 * What is a version control system?
		 * 	It is a system that manages/tracks different versions of our code.
		 * 
		 * GIT (A version control system):
		 *	Git manages all your version of codes in your local computer.
		 *	Git is a version control system, that keeps tracks of all
		 *our different versions in the local repository (storage).
		 *
		 * GITHUB:
		 * 	It is a remote repository.
		 * 
		 * GITBASH Commands:
		 * pwd: current location (folder) of terminal (where the terminal is)
		 * ls: list all the files and folders in current folder
		 * cd: move terminal to its default directory/home directory
		 * cd foldername: "change directory"-->use for change directory(folder)
		 * cd .. :go one step back from current directory
		 * whoami: gives the current userName of the system
		 * hold ctrl and + together and use mouse wheel to increase font size of gitbash
		 * cd ~ :returns the default/home directory
		 * clear : erase terminal screen, it just removes writings on terminal
		 * 
		 *	TRACKING PROJECT USING GIT
		 *1. Navigate your terminal to the location where you want to
		 *create the repository.
		 *2. Create/initialize the repository at this location. In order to create
		 *repository, use this command: git init
		 *NOTE: at this step, if you have not introduced yourself to GitBash,
		 *follow these codes to introduce your GitHub e-mail and username to GitBash:
		 *	git config --global user.email "you@example.com"
		 *	git config --global user.name "Your Name"
		 *3. Type this command: git add .
		 *4. Type this command: git commit -m "1st commit"
		 *Now, all codes are copied to git repository we created.
		 *
		 *	GIT IS A 3 STAGE ARCHITECTURE
		 *It depends on three areas:
		 *	1. working directory
		 *	2. staging area
		 *	3. repository
		 *
		 *	"git status" COMMAND
		 *it tells us the status of the working directory and staging area
		 *it shows in red color the files which git is not tracking (tracking=backup)
		 *it shows in green color the files which git is tracking
		 *(All tracked files must be in staging area)
		 *
		 *	"git add ." COMMAND
		 *Tells the git to start tracking all the files that are in the working directory
		 *(When this command executes, git takes screenshots of the files in current directory
		 *and places in staging area)
		 *
		 */

	}

}
