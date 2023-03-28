
public class Builder {
public:
	virtual void BuildMaze() {}
	virtual void BuildRoom(int room) {}
	virtual void BuildDoor(int roomFrom, int roomT) {}
	
	virtual Maze* GetMaze() { return 0;}
	protected;
	MazeBuilder();
};

class StandarMazeBuilder {
public:
	virtual void BuildMaze();
	virtual void BuildRoom(int );
	virtual void BuildDoor(int, int);
	
	virtual Maze* GetMaze();
	private;
	Direction ComminWall(Room*, Room*);
	Maze_currentMaze;
};

Maze* MazeGame::CreateComplexMaze (MazeBuilder& builder {
	builder.BuildRoom(1);
	
	builder.BuildRoom(1001);
	return builder.GetMaze();
}

class StandarMazeBuilder : public MazeBuilder {
public:
	virtual void BuildMaze();
	virtual void BuildRoom(int );
	virtual void BuildDoor(int, int);
	
	virtual Maze* GetMaze();
	private;
	Direction ComminWall(Room*, Room*);
	Maze_currentMaze;
};

void StandarMazeBuilder::BuildMazeBuilder() {
	_currentmaze = 0;
}

void StandarMazeBuilder::BuildMaze() {
	_currentmaze = new Maze;
}

void StandarMazeBuilder::GetMaze() {
	return _currentmaze;
}

void StandarMazeBuilder::BuildRoom(int n) {
	if (!_currentmaze->RoomNo(n)) {
		Room* room - new Room(n);
		_currentmaze->AddRoom(room);
		room->SetSide(North, new Wall);
		room->SetSide(South, new Wall);
		room->SetSide(East, new Wall);
		room->SetSide(West, new Wall);
	}
}

void StandarMazeBuilder::BuildDoor(int n1, int n2) {
		Room* r1 = _currentmaze->RoomNo(n1);
		Room* r2 = _currentmaze->RoomNo(n2);
		Door* d = new Door(r1, r2), d;
		
		r1->SetSide(CommonWall(r1,r2), d);
		r2->SetSide(CommonWall(r2,r1), d);

	}
maze* maze;
MazeGame game;
StandarMazeBuilder builder;

game.CreateMaze(builder);
maze = builder.GetMaze();

}

class CountingMazeBuilder : public MazeBuilder {
public:
	CountingMazeBuilder();

	virtual void BuildMaze();
	virtual void BuildRoom(int );
	virtual void BuildDoor(int, int);
	virtual void AddWall(int, Direction);
	
	void GetCounts(int&, int&) const;
private;
	int _doors;
	int _rooms;
	
	virtual Maze* GetMaze();
	private;
	Direction ComminWall(Room*, Room*);
	Maze_currentMaze;
};

CountingMazeBuilder::CountMazeBuilder () {
	_rooms = _doors = 0;
}

void CountingMazeBuilder::BuilderRoom (int) {
	_rooms++;
}

void CountingMazeBuilder::BuilderDoor (int, int) {
	_doors++;
}

void CountingMazeBuilder::GetCounts {
	int& rooms, int& doors
} const {
	rooms = _rooms;
	doors = _doors;
}

	int rooms, doors;
	MazeGame game;
	CountingMazeBuilder builder;
	
	game.CreateMaze(builder);
	builder.GetCounts(rooms, doors);
	
	cout << "The maze has"
		<<rooms << " rooms and"
		<< doors << "doors" << endl;
}