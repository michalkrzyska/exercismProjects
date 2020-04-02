class Robot {

    private GridPosition initialGridPosition;
    private GridPosition currentGridPosition;

    private Orientation initialOrientation;
    private Orientation currentOrientation;

    public Robot(GridPosition initialGridPosition, Orientation initialOrientation) {
        this.initialGridPosition = initialGridPosition;
        this.currentGridPosition = initialGridPosition;

        this.initialOrientation = initialOrientation;
        this.currentOrientation = initialOrientation;
    }

    public GridPosition getGridPosition() {
        return currentGridPosition;
    }

    public Orientation getOrientation() {
        return currentOrientation;
    }

    public void turnLeft() {
        switch (getOrientation()) {
            case NORTH:
                currentOrientation = Orientation.WEST;
                break;
            case WEST:
                currentOrientation = Orientation.SOUTH;
                break;
            case SOUTH:
                currentOrientation = Orientation.EAST;
                break;
            case EAST:
                currentOrientation = Orientation.NORTH;
                break;
        }
    }

    public void turnRight() {
        System.out.println(getOrientation());
        switch (getOrientation()) {
            case NORTH:
                currentOrientation = Orientation.EAST;
                break;
            case EAST:
                currentOrientation = Orientation.SOUTH;
                break;
            case SOUTH:
                currentOrientation = Orientation.WEST;
                break;
            case WEST:
                currentOrientation = Orientation.NORTH;
                break;
        }
    }

    public void advance() {
        int x = currentGridPosition.getX();
        int y = currentGridPosition.getY();
        switch (getOrientation()) {
            case NORTH:
                currentGridPosition = new GridPosition(x, y + 1);
                break;
            case WEST:
                currentGridPosition = new GridPosition(x - 1, y);
                break;
            case SOUTH:
                currentGridPosition = new GridPosition(x, y - 1);
                break;
            case EAST:
                currentGridPosition = new GridPosition(x + 1, y);
                break;

        }
    }

    public void simulate(String advance) {
        for (int i = 0; i < advance.length(); i++) {
            switch (advance.charAt(i)) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'A':
                    advance();
                    break;
            }
        }
    }
}