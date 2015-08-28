PROJECT_NAME = $(shell basename `pwd`)

default:
	echo $(PROJECT_NAME)
	rm -rf .git
	git init
	sed -i '' 's/PROJECT_NAME/$(PROJECT_NAME)/' build.sbt
	sbt test
	> README.md
	> Makefile
	echo "Done."

